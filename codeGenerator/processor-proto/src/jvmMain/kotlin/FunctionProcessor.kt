import processor.common.Generator.*
import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import processor.common.BaseProcessor

const val BASE_ANNOTATION_PATH = "org.anime_game_servers.core.base.annotations"
const val BASE_PROTO_ANNOTATION_PATH = "$BASE_ANNOTATION_PATH.proto"
const val PROTO_MODEL_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoModel"
const val PROTO_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoEnum"
const val PROTO_COMMAND_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoCommand"
const val PROTO_VERSION_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoVersionEnum"
const val PROTO_ONE_OF_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.OneOf"

const val COMPILED_PROTO_ANNOTATION = "pbandk.Export"


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

    override fun getTargetPackageName(symbol: KSClassDeclaration): String {
        return symbol.packageName.asString().replaceFirst("gi.data.", "proto.")
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        logger.info("[time] start getting annotated classes")
        resolver.getPackagesWithAnnotation(PROTO_MODEL_ANNOTATION).forEach { logger.info("package: $it") }
        val wrapperEnumSymbols = resolver.getClassSymbolsByAnnotation(PROTO_ENUM_ANNOTATION)
        val wrapperModelSymbols = resolver.getClassSymbolsByAnnotation(PROTO_MODEL_ANNOTATION)
        val wrapperCommandSymbols = resolver.getClassSymbolsByAnnotation(PROTO_COMMAND_ANNOTATION)
        val compiledProtos = resolver.getClassSymbolsByAnnotation(COMPILED_PROTO_ANNOTATION)

        logger.info("[time] handling compiled protos classes")
        val compiledProtosMap = mutableMapOf<String, MutableSet<ProtoData>>()
        compiledProtos.forEach {
            val children = it.declarations.filterIsInstance<KSClassDeclaration>().filter { child ->
                child.superTypes.filter {
                    it.element.toString() == "Message" ||
                            it.element.toString() == "Enum"
                }.count() > 0
            }.map { child ->
                //logger.warn("Found child: ${child.simpleName.asString()}")
                val protoPackage = child.packageName.asString()
                ProtoData(child, protoPackage + "." + it.simpleName.asString(), protoPackage)
            }
            compiledProtosMap.compute(it.simpleName.asString()) { _, v ->
                if (v == null) {
                    mutableSetOf(ProtoData(it))
                } else {
                    v += ProtoData(it)
                    v
                }
            }
            children.forEach { child ->
                // TODO handle sub names for Mapping child classes
                /*if(child.className == "Status") {
                    logger.error("Found Status: ${child.className} ${child}")
                }*/
                compiledProtosMap.compute(it.simpleName.asString() + "." + child.className) { _, v ->
                    if (v == null) {
                        mutableSetOf(child)
                    } else {
                        v += child
                        v
                    }
                }
            }
        }

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

        logger.info("[time] generate enums ${protoEnums.count()}")
        generateFiles(enumGenerator, protoEnums)
        logger.info("[time] generate models ${protoModels.count()}")
        generateFiles(dataGenerator, protoModels)
        logger.info("[time] generate commands")
        generateFiles(commandGenerator, protoCommands)

        //TODO
        logger.info("[time] finish")
        val unableToProcess = wrapperModelSymbols.filterNot { it.validate() }.toList()
        return unableToProcess
    }
}