import com.google.devtools.ksp.*
import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import java.io.File
import java.io.OutputStream

const val BASE_ANNOTATION_PATH = "org.anime_game_servers.core.base.annotations"
const val BASE_PROTO_ANNOTATION_PATH = "$BASE_ANNOTATION_PATH.proto"
const val PROTO_MODEL_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoModel"
const val PROTO_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoEnum"
const val PROTO_COMMAND_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoCommand"
const val PROTO_VERSION_ENUM_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.ProtoVersionEnum"
const val PROTO_ONE_OF_ANNOTATION = "$BASE_PROTO_ANNOTATION_PATH.OneOf"

const val BASE_ADDED_IN_ANNOTATION = "$BASE_ANNOTATION_PATH.AddedIn"
const val BASE_REMOVED_IN_ANNOTATION = "$BASE_ANNOTATION_PATH.RemovedIn"

const val COMPILED_PROTO_ANNOTATION = "pbandk.Export"
//const val VERSION_ENUM_CLASS = "messages.VERSION"
const val VERSION_ENUM_CLASS_NAME = "Version"
const val VERSION_ENUM_CLASS = "org.anime_game_servers.core.base.$VERSION_ENUM_CLASS_NAME"


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

    fun KSClassDeclaration.getProtoAnnotation() = annotations.firstOrNull { it.shortName.asString().startsWith("Proto") }

    fun KSAnnotation.getParentClass() = arguments.firstOrNull { it.name?.asString() == "parentClass" }?.value?.toString()
    fun KSAnnotation.getAltNames() = (arguments.firstOrNull { it.name?.asString() == "alternativeNames" }?.value) as? List<String>
    fun String.getProtoName(parameterName: String?) = parameterName?.let { if(it.isBlank()) this else "$it.$this" } ?: this
    fun KSAnnotation.getVersionName() = (arguments.firstOrNull()?.value as? KSType)?.declaration?.simpleName?.asString() ?:""

    fun getClassInfo(symbols: Sequence<KSClassDeclaration>,
                     fullClassInfoCache: MutableMap<KSType, BaseGenerator.ClassInfo>,
                     compileProtoMap: Map<String, MutableSet<BaseGenerator.ProtoData>>
    )
        :Map<KSType, BaseGenerator.ClassInfo>{
        val typeMap = mutableMapOf<KSType, BaseGenerator.ClassInfo>()
        symbols.forEach {
            val annotation = it.getProtoAnnotation()
            val parentClassName = annotation?.getParentClass()
            val altNames = annotation?.getAltNames() ?: emptyList()
            val name = it.simpleName.asString()

            val protoNames = mutableListOf(name.getProtoName(parentClassName))
            protoNames.addAll(altNames.map { it.getProtoName(parentClassName) })
            val protoName = parentClassName?.let { if(it.isBlank()) name else "$it.$name" } ?: name
            logger.info("Found $name with protoName $protoName")
            val versionProtoSet = protoNames.firstNotNullOfOrNull { protoName ->
                return@firstNotNullOfOrNull compileProtoMap[protoName]
            } ?: run {
                val addedIn = it.annotations.firstOrNull { it.shortName.asString() == "AddedIn" }?.getVersionName()
                val removedIn = it.annotations.firstOrNull { it.shortName.asString() == "RemovedIn" }?.getVersionName()
                logger.warn("No proto found for $name addedIn $addedIn removedIn $removedIn")
                mutableSetOf()
            }
            val targetPackage = it.packageName.asString().replaceFirst("data.","messages.")
            val dependencies = mutableSetOf<KSFile>().apply{
                add(it.containingFile!!)
                versionProtoSet.mapTo(this) { it.classDeclaration.containingFile!! }
            }

            val info = BaseGenerator.ClassInfo(name, targetPackage, it, dependencies, versionProtoSet, true)
            logger.info("ClassInfo $info")

            typeMap[it.asStarProjectedType()] = info
            fullClassInfoCache[it.asStarProjectedType()] = info
        }
        return typeMap
    }

    fun addBaseTypesToCache(resolver: Resolver, fullClassInfoCache: MutableMap<KSType, BaseGenerator.ClassInfo>){
        addBaseTypeToCache("Float", resolver, fullClassInfoCache)
        addBaseTypeToCache("Int", resolver, fullClassInfoCache)
        addBaseTypeToCache("String", resolver, fullClassInfoCache)
        addBaseTypeToCache("Double", resolver, fullClassInfoCache)
        addBaseTypeToCache("Long", resolver, fullClassInfoCache)
    }
    fun addBaseTypeToCache(classname: String, resolver: Resolver, fullClassInfoCache: MutableMap<KSType, BaseGenerator.ClassInfo>){
        val kClass = resolver.getKotlinClassByName("kotlin.$classname") ?: run {
            logger.error("Unable to find class $classname")
            return
        }

        val info = BaseGenerator.ClassInfo(classname, "kotlin", kClass, emptySet(), emptySet(), false)
        fullClassInfoCache[kClass.asStarProjectedType()] = info
    }

    fun generateFiles(generator: BaseGenerator, classInfoMap: Map<KSType, BaseGenerator.ClassInfo>){
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
    fun generatePackageIdFile(logger: KSPLogger,
                              versionPackageIdMap: Map<String, PacketIdGenerator.PacketIdResult>){
        val versionGenerator = PacketIdGenerator(logger)
        versionPackageIdMap.forEach { (versionName, packageIdMaps) ->
            logger.info("generating packageIds files: ${packageIdMaps.dependencies.joinToString { it.toString() }}")
            val file: OutputStream = codeGenerator.createNewFile(
                // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
                // Learn more about incremental processing in KSP from the official docs:
                // https://kotlinlang.org/docs/ksp-incremental.html
                dependencies = Dependencies(true, *packageIdMaps.dependencies.toTypedArray()),
                packageName = "package_id",
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
            packageName = "package_id",
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

        val compiledProtos = resolver.getClassSymbolsByAnnotation(COMPILED_PROTO_ANNOTATION)

        val versionClassWorkaround = resolver.getClassSymbolsByAnnotation(PROTO_VERSION_ENUM_ANNOTATION).firstOrNull()
        val versionClass = resolver.getClassDeclarationByName(VERSION_ENUM_CLASS) ?: run {
            logger.error("[resources] Unable to find version class $VERSION_ENUM_CLASS")
            return emptyList()
        }

        val resourcesPath = versionClassWorkaround?.let {
            it.containingFile?.let { file ->
                val basePath = file.filePath.removeSuffix("kotlin/messages/VERSION.kt")
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
        val compiledProtosMap = mutableMapOf<String, MutableSet<BaseGenerator.ProtoData>>()
        compiledProtos.forEach {
            val children = it.declarations.filterIsInstance<KSClassDeclaration>().filter { child ->
                child.superTypes.filter { 
                    it.element.toString() == "Message" ||
                    it.element.toString() == "Enum"
                }.count()>0
            }.map { child ->
                //logger.warn("Found child: ${child.simpleName.asString()}")
                val protoPackage = child.packageName.asString()
                BaseGenerator.ProtoData(child, protoPackage+"."+it.simpleName.asString(), protoPackage)
            }
            compiledProtosMap.compute(it.simpleName.asString()) { _, v ->
                if (v == null) {
                    mutableSetOf(BaseGenerator.ProtoData(it))
                } else {
                    v+=BaseGenerator.ProtoData(it)
                    v
                }
            }
            children.forEach {child ->
                // TODO handle sub names for Mapping child classes
                /*if(child.className == "Status") {
                    logger.error("Found Status: ${child.className} ${child}")
                }*/
                compiledProtosMap.compute(it.simpleName.asString()+"."+child.className) { _, v ->
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
        val classInfoCache= mutableMapOf<KSType, BaseGenerator.ClassInfo>()
        addBaseTypesToCache(resolver, classInfoCache)
        val protoEnums= getClassInfo(wrapperEnumSymbols, classInfoCache, compiledProtosMap)
        val protoModels=  getClassInfo(wrapperModelSymbols, classInfoCache, compiledProtosMap)
        val protoCommands= getClassInfo(wrapperCommandSymbols, classInfoCache, compiledProtosMap)


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