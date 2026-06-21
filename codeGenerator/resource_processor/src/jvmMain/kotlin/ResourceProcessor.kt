import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import common.BASE_PACKET_KEY
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.annotations.ModuleMetaData
import java.io.File
import java.io.OutputStream

const val BASE_ANNOTATION_PATH = "org.anime_game_servers.core.base.annotations"
const val BASE_PROTO_ANNOTATION_PATH = "$BASE_ANNOTATION_PATH.proto"
const val PROTO_ONE_OF_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.OneOf"

const val COMPILED_PROTO_ANNOTATION = "pbandk.Export"
//const val VERSION_ENUM_CLASS = "messages.VERSION"
val VERSION_ENUM_CLASS_NAME : String = Version::class.java.simpleName
val VERSION_ENUM_CLASS : String = Version::class.java.canonicalName


/**
 * TODOs
 * - Add OneOf handling
 */
@OptIn(KspExperimental::class)
class ResourceProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    private val options: Map<String, String>
) : SymbolProcessor {


    fun Resolver.getClassSymbolsByAnnotation(annotationName: String): Sequence<KSClassDeclaration>{
        return getSymbolsWithAnnotation(annotationName)
            .filterIsInstance<KSClassDeclaration>()
    }

    fun generatePackageIdFile(logger: KSPLogger,
                              versionPackageIdMap: Map<String, PacketIdGenerator.PacketIdResult>){
        val basePacket = options[BASE_PACKET_KEY] ?: ""
        val versionGenerator = PacketIdGenerator(logger, basePacket)
        versionPackageIdMap.forEach { (versionName, packageIdMaps) ->
            logger.info("generating packageIds files: ${packageIdMaps.dependencies.joinToString { it.toString() }}")
            val file: OutputStream = codeGenerator.createNewFile(
                // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
                // Learn more about incremental processing in KSP from the official docs:
                // https://kotlinlang.org/docs/ksp-incremental.html
                dependencies = Dependencies(true, *packageIdMaps.dependencies.toTypedArray()),
                packageName = "$basePacket.packet_id",
                fileName = versionName
            )
            logger.info("generating ${packageIdMaps.dependencies.joinToString { it.toString() }}")

            versionGenerator.createClassForProto(file, versionName, packageIdMaps)
        }

        val versions = versionPackageIdMap.keys
        logger.info("generating packageId version mapping: ${versions.size} ${versions.joinToString { it }}")
        val file: OutputStream = codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = Dependencies(true, *versionPackageIdMap.values.first().dependencies.toTypedArray()),
            packageName = "$basePacket.packet_id",
            fileName = "PackageIds"
        )

        versionGenerator.createClassForVersionMapper(file, versions)
    }


    fun readPackageIds(resourcesBaseDir: File, versionClass: KSClassDeclaration) : Map<String, PacketIdGenerator.PacketIdResult>{
        val packageIdDir = File(resourcesBaseDir, "package_ids")
        val idFiles = packageIdDir.listFiles { dir, name ->
            name.endsWith(".csv")
        } ?: run {
            logger.error("[resources] Unable to read package_ids dir")
            return emptyMap()
        }

        val versionMap = mutableMapOf<String,PacketIdGenerator.PacketIdResult >()

        val versionsList = versionClass.declarations.filter { it is KSClassDeclaration }.map { prop ->
            prop.simpleName.asString()
        }
        val dependencies = mutableSetOf<KSFile>().apply{
            //add(versionClass.containingFile!!)
        }

        idFiles.forEach {
            logger.info("[resources] ${it.name}")
            val versionName = it.nameWithoutExtension
            if(!versionsList.contains(versionName)){
                logger.error("[resources] Unable to find version entry for $versionName in ${versionClass.simpleName.asString()}")
                return@forEach
            }
            val nameIdMap = mutableMapOf<String, Int>()
            val idNameMap = mutableMapOf<Int, String>()

            it.readLines().forEach readLine@{ line ->
                val split = line.split(",")
                if (split.size != 2) {
                    logger.error("[resources] Unable to parse line $line")
                    return@readLine
                }
                val packageName = split[0]
                val packageId = split[1].toIntOrNull() ?: run {
                    logger.error("[resources] Unable to parse packageId ${split[1]} for $packageName")
                    return@readLine
                }
                nameIdMap[packageName] = packageId
                idNameMap[packageId] = packageName
            }
            versionMap[versionName] = PacketIdGenerator.PacketIdResult( dependencies,  nameIdMap, idNameMap)
            // todo find way to add resources as dependency
        }
        return versionMap
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val versionClassWorkaround = resolver.getClassSymbolsByAnnotation(ModuleMetaData::class.java.canonicalName).firstOrNull()
        val versionClass = resolver.getClassDeclarationByName(VERSION_ENUM_CLASS) ?: run {
            logger.error("[resources] Unable to find version class $VERSION_ENUM_CLASS")
            return emptyList()
        }

        val resourcesPath = versionClassWorkaround?.let {
            it.containingFile?.let { file ->
                val basePath = file.filePath.removeSuffix("kotlin/${file.fileName}")
                logger.warn("[resources] BasePath: $basePath")
                basePath+"resources"
            }?: run {
                logger.error("[resources] Unable to find resources dir fir packageIds")
                return emptyList()
            }
        }
        logger.info("[resources] $resourcesPath")

        val resourcesDir = resourcesPath?.let {
            File(resourcesPath)
        }
        //if (!resourcesDir?.exists()) {
        //logger.error("[resources] Unable to find resources dir fir packageIds")
        //return emptyList()
        //}

        val packageIdMaps = resourcesDir?.let {
            readPackageIds(resourcesDir, versionClass)
        }
        packageIdMaps?.let {
            logger.info("[time] generate version")
            generatePackageIdFile(logger, it)
        }

        //val unableToProcess = wrapperModelSymbols.filterNot { it.validate() }.toList()
        return emptyList()
    }
}
