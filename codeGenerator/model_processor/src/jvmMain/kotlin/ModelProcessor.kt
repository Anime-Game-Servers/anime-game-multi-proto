@file:OptIn(KspExperimental::class)

import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import common.DATA_PACKAGE_SUFFIX
import common.GENERATED_PACKAGE_SUFFIX
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import kotlin.collections.set

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

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val wrapperEnumSymbols = resolver.getClassSymbolsByAnnotation(ProtoEnum::class.java.canonicalName)
        val wrapperModelSymbols = resolver.getClassSymbolsByAnnotation(ProtoModel::class.java.canonicalName)
        val wrapperCommandSymbols = resolver.getClassSymbolsByAnnotation(ProtoCommand::class.java.canonicalName)

        logger.info("[time] sorting stuff")
        // targetClassInfo based from our interfaces
        val classInfoCache= mutableMapOf<KSType, ClassInfo>()
        addBaseTypesToCache(resolver, classInfoCache)
        val protoEnums = getClassInfo(wrapperEnumSymbols, classInfoCache)
        val protoModels =  getClassInfo(wrapperModelSymbols, classInfoCache)
        val protoCommands = getClassInfo(wrapperCommandSymbols, classInfoCache)

        protoEnums.forEach { classInfo ->
            EnumGenerator.createFileForMetaData(classInfo.value, codeGenerator)
        }
        val modelGenerator = ModelGenerator(logger, resolver, classInfoCache,
            GeneratorOptions(kspOptions = options)
        )
        protoModels.forEach { classInfo ->
            modelGenerator.createFileForMetaData(classInfo.value, codeGenerator)
        }
        protoCommands.forEach { classInfo ->
            modelGenerator.createFileForMetaData(classInfo.value, codeGenerator)
        }

        return emptyList() // todo;
    }


    fun getClassInfo(symbols: Sequence<KSClassDeclaration>,
                     fullClassInfoCache: MutableMap<KSType, ClassInfo>
    )
            :Map<KSType, ClassInfo>{
        val typeMap = mutableMapOf<KSType, ClassInfo>()
        symbols.forEach {
            val annotation = it.getProtoAnnotation()
            val altNames = annotation?.getAltNames() ?: emptyList()
            val name = it.simpleName.asString()
            val names = (altNames+name).toSet()

            val targetPackage = it.packageName.asString().replaceFirst("$DATA_PACKAGE_SUFFIX.","$GENERATED_PACKAGE_SUFFIX.")
            val dependencies = mutableSetOf<KSFile>().apply{
                add(it.containingFile!!)
            }

            val info = ClassInfo(name, targetPackage, it, dependencies, names = names)
            logger.info("ClassInfo $info")

            typeMap[it.asStarProjectedType()] = info
            fullClassInfoCache[it.asStarProjectedType()] = info
        }
        return typeMap
    }

    fun addBaseTypeToCache(classname: String, resolver: Resolver, fullClassInfoCache: MutableMap<KSType, ClassInfo>){
        val kClass = resolver.getKotlinClassByName("kotlin.$classname") ?: run {
            logger.error("Unable to find class $classname")
            return
        }

        val info = ClassInfo(classname, "kotlin", kClass, emptySet())
        fullClassInfoCache[kClass.asStarProjectedType()] = info
    }


    fun addBaseTypesToCache(resolver: Resolver, fullClassInfoCache: MutableMap<KSType, ClassInfo>){
        addBaseTypeToCache("Float", resolver, fullClassInfoCache)
        addBaseTypeToCache("Int", resolver, fullClassInfoCache)
        addBaseTypeToCache("UInt", resolver, fullClassInfoCache)
        addBaseTypeToCache("String", resolver, fullClassInfoCache)
        addBaseTypeToCache("Char", resolver, fullClassInfoCache)
        addBaseTypeToCache("Double", resolver, fullClassInfoCache)
        addBaseTypeToCache("Long", resolver, fullClassInfoCache)
    }

}
