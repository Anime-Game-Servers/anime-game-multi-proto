import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import java.io.OutputStream

const val BASE_ANNOTATION_PATH = "org.anime_game_servers.annotations"
const val PROTO_MODEL_ANNOTATION = "$BASE_ANNOTATION_PATH.ProtoModel"
const val PROTO_ENUM_ANNOTATION = "$BASE_ANNOTATION_PATH.ProtoEnum"
const val PROTO_COMMAND_ANNOTATION = "$BASE_ANNOTATION_PATH.ProtoCommand"

const val COMPILED_PROTO_ANNOTATION = "pbandk.Export"
const val VERSION_ENUM_CLASS = "VERSION"


/**
 * TODOs
 * - Add OneOf handling
 */
@OptIn(KspExperimental::class)
class FunctionProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    private val options: Map<String, String>
) : SymbolProcessor {

    fun Resolver.getClassSymbolsByAnnotation(annotationName: String): Sequence<KSClassDeclaration>{
        return getSymbolsWithAnnotation(annotationName)
            .filterIsInstance<KSClassDeclaration>()
    }

    fun getClassInfo(symbols: Sequence<KSClassDeclaration>,
                     fullClassInfoCache: MutableMap<KSType, BaseGenerator.ClassInfo>,
                     compileProtoMap: Map<String, MutableSet<BaseGenerator.ProtoData>>
    )
        :Map<KSType, BaseGenerator.ClassInfo>{
        val typeMap = mutableMapOf<KSType, BaseGenerator.ClassInfo>()
        symbols.forEach {
            val name = it.simpleName.asString()
            val versionProtoSet = compileProtoMap[name] ?: run {
                logger.warn("No proto found for $name")
                return@forEach
            }
            val targetPackage = it.packageName.asString().replaceFirst("data.","messages.")
            val dependencies = mutableSetOf<KSFile>().apply{
                add(it.containingFile!!)
                versionProtoSet.mapTo(this) { it.classDeclaration.containingFile!! }
            }

            val info = BaseGenerator.ClassInfo(name, targetPackage, it, dependencies, versionProtoSet)
            typeMap[it.asStarProjectedType()] = info
            fullClassInfoCache[it.asStarProjectedType()] = info
        }
        return typeMap
    }

    fun generateFiles(generator: BaseGenerator, classInfoMap: Map<KSType, BaseGenerator.ClassInfo>){
        classInfoMap.values.forEach { classInfo ->
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
        }
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val wrapperEnumSymbols = resolver.getClassSymbolsByAnnotation(PROTO_ENUM_ANNOTATION)
        val wrapperModelSymbols = resolver.getClassSymbolsByAnnotation(PROTO_MODEL_ANNOTATION)
        val wrapperCommandSymbols = resolver.getClassSymbolsByAnnotation(PROTO_COMMAND_ANNOTATION)

        val compiledProtos = resolver.getClassSymbolsByAnnotation(COMPILED_PROTO_ANNOTATION)

        val versionClass = resolver.getKotlinClassByName(VERSION_ENUM_CLASS)


        val compiledProtosMap = mutableMapOf<String, MutableSet<BaseGenerator.ProtoData>>()
        compiledProtos.forEach {
            compiledProtosMap.compute(it.simpleName.asString()) { _, v ->
                if (v == null) {
                    mutableSetOf(BaseGenerator.ProtoData(it))
                } else {
                    v+=BaseGenerator.ProtoData(it)
                    v
                }
            }
        }

        // targetClassInfo based from our interfaces
        val classInfoCache= mutableMapOf<KSType, BaseGenerator.ClassInfo>()
        val protoEnums= getClassInfo(wrapperEnumSymbols, classInfoCache, compiledProtosMap)
        val protoModels=  getClassInfo(wrapperModelSymbols, classInfoCache, compiledProtosMap)
        val protoCommands= getClassInfo(wrapperCommandSymbols, classInfoCache, compiledProtosMap)

        val enumGenerator = EnumGenerator(logger, resolver, classInfoCache)
        val dataGenerator = DataGenerator(logger, resolver, classInfoCache)
        val commandGenerator = DataGenerator(logger, resolver, classInfoCache) //TODO: Change to command generator

        generateFiles(enumGenerator, protoEnums)
        generateFiles(dataGenerator, protoModels)
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
        val unableToProcess = wrapperModelSymbols.filterNot { it.validate() }.toList()
        return unableToProcess
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