import processor.common.Generator.*
import processor.common.BaseProcessor
import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.annotations.ModuleMetaData
import java.io.File
import java.io.OutputStream

const val BASE_ANNOTATION_PATH = "org.anime_game_servers.core.base.annotations"
const val BASE_PROTO_ANNOTATION_PATH = "$BASE_ANNOTATION_PATH.proto"
const val PROTO_MODEL_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoModel"
const val PROTO_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoEnum"
const val PROTO_COMMAND_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoCommand"
const val PROTO_VERSION_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoVersionEnum"
const val PROTO_ONE_OF_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.OneOf"

//const val VERSION_ENUM_CLASS = "messages.VERSION"
val VERSION_ENUM_CLASS_NAME : String = Version::class.java.simpleName
val VERSION_ENUM_CLASS : String = Version::class.java.canonicalName

/**
 * TODOs
 * - Add OneOf handling
 */
@OptIn(KspExperimental::class)
class FunctionProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    private val options: Map<String, String>
) : BaseProcessor(codeGenerator, logger) {

    fun generatePackageIdFile(logger: KSPLogger,
                              versionPackageIdMap: Map<String, PacketIdGenerator.PacketIdResult>){
        val basePacket = options["basePacket"] ?: ""
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
        logger.info("[time] start getting annotated classes")
        val wrapperEnumSymbols = resolver.getClassSymbolsByAnnotation(PROTO_ENUM_ANNOTATION)
        val wrapperModelSymbols = resolver.getClassSymbolsByAnnotation(PROTO_MODEL_ANNOTATION)
        val wrapperCommandSymbols = resolver.getClassSymbolsByAnnotation(PROTO_COMMAND_ANNOTATION)

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

        logger.info("[time] handling compiled protos classes")
        val compiledProtosMap = mutableMapOf<String, MutableSet<ProtoData>>()

        logger.info("[time] sorting stuff")
        // targetClassInfo based from our interfaces
        val classInfoCache = mutableMapOf<KSType, ClassInfo>()
        addBaseTypesToCache(resolver, classInfoCache)
        val protoEnums = getClassInfo(wrapperEnumSymbols, classInfoCache, compiledProtosMap)
        val protoModels = getClassInfo(wrapperModelSymbols, classInfoCache, compiledProtosMap)
        val protoCommands = getClassInfo(wrapperCommandSymbols, classInfoCache, compiledProtosMap)


        logger.info("[time] create generators")
        val enumGenerator = EnumGenerator(logger, resolver, classInfoCache)
        val dataGenerator = DataGenerator(logger, resolver, classInfoCache)
        val commandGenerator = CommandGenerator(logger, resolver, classInfoCache)

        packageIdMaps?.let {
            logger.info("[time] generate version")
            generatePackageIdFile(logger, it)
        }
        logger.info("[time] generate enums")
        generateFiles(enumGenerator, protoEnums)
        logger.info("[time] generate models")
        generateFiles(dataGenerator, protoModels)
        logger.info("[time] generate commands")
        generateFiles(commandGenerator, protoCommands)


        /*val symbols = resolver.getSymbolsWithAnnotation("org.anime_game_servers.annotations.ProtoModel")
            .filterIsInstance<KSClassDeclaration>()
        val protos = resolver.getSymbolsWithAnnotation("pbandk.Export")
            .filterIsInstance<KSClassDeclaration>()
        symbols.forEach { symbol ->
            logger.warn("Found symbol: ${symbol.simpleName.asString()}")
            symbol.declarations.forEach {
                logger.warn("Found declarations: $it ")
                (it as? KSPropertyDeclaration)?.getter?.returnType?.resolve()?.declaration?.let { decl ->
                    logger.warn("Found return type: ${decl.simpleName.asString()}")
                }
                it.typeParameters.forEach { type ->
                    logger.warn("Found type: ${type.name.asString()}")
                }
            }
        }

        versionClass?.declarations?.forEach {
            logger.warn("Found versions: $it with namespace $it")
        }

        if (!symbols.iterator().hasNext()) return emptyList()

        val protosMap = mutableMapOf<String, MutableSet<BaseGenerator.ProtoData>>()
        protos.forEach {
            protosMap.compute(it.simpleName.asString()) { _, v ->
                if (v == null) {
                    mutableSetOf(BaseGenerator.ProtoData(it))
                } else {
                    v+=BaseGenerator.ProtoData(it)
                    v
                }
            }
        }

        symbols.forEach {
            val versionProtos = protosMap[it.simpleName.asString()]
            if (versionProtos != null) {
                logger.warn("Found ${versionProtos.size} protos for ${it.simpleName.asString()} ")
                versionProtos.forEach { proto ->
                    logger.warn("versions: ${proto.versionPackage}")
                }
                createClassForProto(resolver, it, versionProtos)
            }
        }*/
        //TODO
        logger.info("[time] finish")
        val unableToProcess = wrapperModelSymbols.filterNot { it.validate() }.toList()
        return unableToProcess
    }

    override fun getTargetPackageName(symbol: KSClassDeclaration): String {
        return symbol.packageName.asString().replaceFirst("data.","messages.")
    }

    /*private fun createClassForProto(resolver: Resolver, classInfo: BaseGenerator.ClassInfo, generator: BaseGenerator) {
        val file: OutputStream = codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = Dependencies(false, *classInfo.dependencies.toTypedArray()),
            packageName = classInfo.packageName,
            fileName = classInfo.name
        )

        generator.createClassForProto(file, classInfo)
        file.close()
    }*/
}