package processor.common

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import processor.common.Generator.ClassInfo
import processor.common.Generator.ProtoData
import java.io.OutputStream
import kotlin.collections.set
import kotlin.sequences.forEach

@OptIn(KspExperimental::class)
abstract class BaseProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
) : SymbolProcessor {
    private fun KSClassDeclaration.getProtoAnnotation() = annotations.firstOrNull { it.shortName.asString().startsWith("Proto") }
    private fun KSAnnotation.getParentClass() = arguments.firstOrNull { it.name?.asString() == "parentClass" }?.value?.toString()
    private fun KSAnnotation.getAltNames() = (arguments.firstOrNull { it.name?.asString() == "alternativeNames" }?.value) as? List<String>
    private fun String.getProtoName(parameterName: String?) = parameterName?.let { if(it.isBlank()) this else "$it.$this" } ?: this
    private fun KSAnnotation.getVersionName() = (arguments.firstOrNull()?.value as? KSType)?.declaration?.simpleName?.asString() ?:""

    abstract fun getTargetPackageName(symbol: KSClassDeclaration): String

    fun Resolver.getClassSymbolsByAnnotation(annotationName: String): Sequence<KSClassDeclaration>{
        return getSymbolsWithAnnotation(annotationName)
            .filterIsInstance<KSClassDeclaration>()
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
    fun addBaseTypeToCache(classname: String, resolver: Resolver, fullClassInfoCache: MutableMap<KSType, ClassInfo>){
        val kClass = resolver.getKotlinClassByName("kotlin.$classname") ?: run {
            logger.error("Unable to find class $classname")
            return
        }

        val info = ClassInfo(classname, "kotlin", kClass, emptySet(), emptySet(), false)
        fullClassInfoCache[kClass.asStarProjectedType()] = info
    }

    fun getClassInfo(symbols: Sequence<KSClassDeclaration>,
                     fullClassInfoCache: MutableMap<KSType, ClassInfo>,
                     compileProtoMap: Map<String, MutableSet<ProtoData>>
    )
            :Map<KSType, ClassInfo>{
        val typeMap = mutableMapOf<KSType, ClassInfo>()
        symbols.forEach {
            val annotation = it.getProtoAnnotation()
            val parentClassName = annotation?.getParentClass()
            val altNames = annotation?.getAltNames() ?: emptyList()
            val name = it.simpleName.asString()
            val names = (altNames+name).toSet()

            val protoNames = names.map { it.getProtoName(parentClassName) }
            logger.info("Found $name with protoName ${protoNames.first()}")

            val versionProtoSet = protoNames.firstNotNullOfOrNull { protoName ->
                return@firstNotNullOfOrNull compileProtoMap[protoName]
            } ?: run {
                val addedIn = it.annotations.firstOrNull { it.shortName.asString() == "AddedIn" }?.getVersionName()
                val removedIn = it.annotations.firstOrNull { it.shortName.asString() == "RemovedIn" }?.getVersionName()
                logger.warn("No proto found for $name addedIn $addedIn removedIn $removedIn")
                mutableSetOf()
            }
            val targetPackage = getTargetPackageName(it)
            val dependencies = mutableSetOf<KSFile>().apply{
                add(it.containingFile!!)
                versionProtoSet.mapTo(this) { it.classDeclaration.containingFile!! }
            }

            val info = ClassInfo(name, targetPackage, it, dependencies, versionProtoSet, true, names = names)
            logger.info("ClassInfo $info")

            typeMap[it.asStarProjectedType()] = info
            fullClassInfoCache[it.asStarProjectedType()] = info
        }
        return typeMap
    }

    fun generateFiles(generator: Generator, classInfoMap: Map<KSType, ClassInfo>){
        logger.info("generating files: ${classInfoMap.size}")
        classInfoMap.values.forEach { classInfo ->
            val file: OutputStream = codeGenerator.createNewFile(
                // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
                // Learn more about incremental processing in KSP from the official docs:
                // https://kotlinlang.org/docs/ksp-incremental.html
                dependencies = Dependencies(true, classInfo.definition.containingFile!!),
                packageName = classInfo.packageName,
                fileName = classInfo.name
            )
            //logger.warn("generating ${classInfo.name} ${classInfo.packageName} ${classInfo.definition.containingFile} ${classInfo.dependencies?.joinToString { it.filePath }}")
            generator.createClassForProto(file, classInfo)
        }
    }
}
