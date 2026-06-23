import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import common.BASE_PACKET_KEY
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.annotations.ModuleMetaData
import java.io.File
import java.io.OutputStream

val VERSION_ENUM_CLASS : String = Version::class.java.canonicalName

/**
 *
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
                              versionPackageIdMap: Map<String, PacketIdResult>){
        val basePacket = options[BASE_PACKET_KEY] ?: ""
        val config = PacketIdConfig("$basePacket.packet_id")
        val versionGeneratorN = PacketIdGeneratorNew(config)
        versionPackageIdMap.forEach { (versionName, packageIdMaps) ->
            logger.info("generating packageIds files: ${packageIdMaps.dependencies.joinToString { it.toString() }}")
            versionGeneratorN.createFileForMetaData(versionName, packageIdMaps, codeGenerator)

        }

        val versions = versionPackageIdMap.keys
        logger.info("generating packageId version mapping: ${versions.size} ${versions.joinToString { it }}")
        PacketIdMapperGenerator(config).createFileForMetaData(versionPackageIdMap, codeGenerator)
    }


    fun readPackageIds(resourcesBaseDir: File, versionClass: KSClassDeclaration) : Map<String, PacketIdResult>{
        val packageIdDir = File(resourcesBaseDir, "package_ids")
        val idFiles = packageIdDir.listFiles { dir, name ->
            name.endsWith(".csv")
        } ?: run {
            logger.error("[resources] Unable to read package_ids dir")
            return emptyMap()
        }

        val versionMap = mutableMapOf<String,PacketIdResult >()

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
            versionMap[versionName] = PacketIdResult( dependencies,  nameIdMap, idNameMap)
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
                logger.info("[resources] BasePath: $basePath")
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
