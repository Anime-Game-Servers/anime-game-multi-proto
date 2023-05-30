import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import java.io.OutputStream
import java.util.*

@OptIn(KspExperimental::class)
abstract class BaseGenerator(
    val logger: KSPLogger,
    val resolver: Resolver,
    val classInfoCache: MutableMap<KSType, ClassInfo>,
) {
    val enumType = resolver.getKotlinClassByName("kotlin.Enum")
    val mapClass = resolver.getKotlinClassByName("kotlin.collections.Map.Entry")

    fun createClassForProto(file: OutputStream, classInfo:ClassInfo) {
        file += "package ${classInfo.packageName}\n"
        addImports(file, classInfo)
        addConstructor(file, classInfo)
        addBody(file, classInfo)
        addEncodeMethods(file, classInfo)
        addCompanionObject(file, classInfo)
        file.close()
    }

    open fun addImports(file:OutputStream, classInfo: ClassInfo){
        file += "import messages.VERSION\n"+
                "import annotations.AddedIn\n"+
                "import annotations.RemovedIn\n"+
                "import kotlin.jvm.JvmStatic\n"+
                "import kotlin.jvm.JvmOverloads\n"
    }

    open fun addConstructor(file:OutputStream, classInfo:ClassInfo){
        //add the kdoc if it exists //TODO
        classInfo.definition.docString?.let {
            file += "/**${it.replace("\n","\n  * ")}*/\n"
        }
    }
    open fun addBody(file:OutputStream, classInfo:ClassInfo){

    }

    open fun addEncodeMethods(file:OutputStream, classInfo: ClassInfo){

    }

    open fun addParsingMethods(file:OutputStream, classInfo:ClassInfo){
    }

    open fun addCompanionObject(file: OutputStream, classInfo:ClassInfo){

        file.id(4) +="companion object {\n"
        addParsingMethods(file, classInfo)
        file += "}\n"
    }

    public data class OneOfData(
        val type: KSType,
        val variableName: String,
        val wrapperName: String = variableName.capitalizeFirstLetter()
    )

    public data class ClassInfo(
        val name: String,
        val packageName: String,
        val definition: KSClassDeclaration,
        val dependencies: Set<KSFile>,
        val protoSet: MutableSet<ProtoData>,
        val originalPackage: String = definition.packageName.asString(),
        val modelMembers: Map<String, KSType> = getMembers(definition),
        val oneOfs: Map<KSType, OneOfData> = modelMembers.filterValues { it.declaration.simpleName.asString() == "OneOf" }
            .entries.associate { it.value to OneOfData(it.value, it.key) }
    )

    protected fun getFullNameForTarget(targetType:KSType, fallback:String, sourceType:KSType?):String{
        return classInfoCache[sourceType]?.let {
            it.packageName + "." + it.name
        } ?: fallback
    }

    protected fun addConstructorMembers(
        indentation: Int,
        sourceMembers: Map<String, KSType>,
        targetMembers: Map<String, KSType>,
        file: OutputStream,
        sourcePrefix: String? = null,
        dataMethod: DataMethodInfo
    ) {
        targetMembers.forEach {
            if (!sourceMembers.containsKey(it.key)) {
                return@forEach
            }
            val sourceVarName = sourcePrefix?.let {pf -> "$pf.${it.key}" } ?: it.key
            file.id(indentation)+= when (Type.byType(it.value, this)) {
                Type.SIMPLE -> "${it.key} = $sourceVarName,\n"
                Type.COLLECTION -> {
                    "${getFullNameForTarget(it.value, it.key, sourceMembers[it.key])} = ${
                        convertToCollection(
                            it.value,
                            sourceMembers[it.key]!!,
                            sourceVarName,
                            dataMethod,
                            resolver
                        )
                    },\n"
                }
                Type.MAP_ENTRY ->  "${it.key} = ${
                    convertToMap(
                        it.value,
                        sourceMembers[it.key]!!,
                        sourceVarName,
                        dataMethod,
                        resolver
                    )
                },\n"
                Type.MAP ->  "${it.key} = ${
                    convertToMap(
                        it.value,
                        sourceMembers[it.key]!!,
                        sourceVarName,
                        dataMethod,
                        resolver
                    )
                },\n"
                Type.ENUM -> {
                    "${it.key} = ${dataMethod.getDataCall(sourceVarName, it.value.getFullClassName(), true)},\n"
                }
                Type.DATA -> {
                    "${it.key} = ${dataMethod.getDataCall(sourceVarName, it.value.getFullClassName())},\n"
                }
            }
        }
    }

    private fun convertToCollection(
        outType: KSType,
        inType: KSType,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver
    ): String {
        val outParameter = outType.arguments.first().type?.resolve()
            ?: throw IllegalStateException("unknown list param type for var $varName")
        val inParameter = inType.arguments.firstOrNull()?.type?.resolve()
        if(inType == outType && inParameter!=null && inParameter == outParameter){
            logger.warn("same list type $varName")
            return varName
        }
        val outParameterName = outParameter.declaration.simpleName.asString()
        //logger.warn("list equals ${inType == outType} ${outParameter==inParameter}\n\t$outParameterName\t${inParameter?.declaration?.simpleName?.asString()}")
        //logger.warn("field type: $varName $outParameterName ${Type.byType(outParameter, this)} ${Type.byType(inType, this)} o$outParameter i$inParameter\n")
        return when (Type.byType(outParameter, this)) {
            Type.SIMPLE -> "emptyList()"// TODO convert
            Type.COLLECTION -> ""
            Type.MAP -> ""
            Type.MAP_ENTRY -> {
                val outTypes = getMapEntryTypePair(outParameter,resolver)
                if(Type.byType(inType, this) == Type.MAP){
                    val inTypes = getMapEntryTypePair(inType, resolver)
                    mapToCollection(inTypes, outTypes, varName, dataMethod, outParameter, resolver)
                } else {
                    ""
                }
            }
            Type.ENUM -> "" //TODO

            Type.DATA -> {
                val dataTarget = dataMethod.getDataCall("it", outParameter.getFullClassName(), true)
                "$varName.map { $dataTarget }"
            }
        }
    }

    data class DataMethodInfo(val methodName:String,
                              val isMemberCall:Boolean,
                              val overwritePackagePath:String? = null){
        fun getDataCall(variable: String, methodClassPath: String, isNullSave:Boolean = false):String{
            return if (isMemberCall)
                "$variable.$methodName()"
            else {
                val classPath =
                    //overwritePackagePath?.let {
                        overwritePackagePath?.split("/")?.let {
                            "${methodClassPath.replaceFirst(it.first(), it[1])}"
                        } ?: methodClassPath
                        //"$it.${methodClassPath.split('.').last()}"
                    //} ?: methodClassPath
                if(isNullSave){
                    "$classPath.$methodName($variable)"
                } else {
                    "$variable?.let{ member -> $classPath.$methodName(member)} ?: $classPath()"
                }
            }
        }
    }

    fun KSType.getFullClassName() : String{
        return declaration.getFullClassName()
    }

    fun KSDeclaration.getFullClassName() : String{
        parentDeclaration?.let {
            return it.getFullClassName()+"."+simpleName.asString()
        }
        return packageName.asString()+"."+simpleName.asString()
    }

    fun collectionToCollection(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>, varName: String, dataMethod: DataMethodInfo, outType:KSType, resolver: Resolver) : String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.map {${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries)}}"
    }
    fun mapToCollection(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>, varName: String, dataMethod: DataMethodInfo, outType:KSType, resolver: Resolver) : String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.map {${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries, true)}}"
    }
    fun collectionToMap(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>, varName: String, dataMethod: DataMethodInfo, outType:KSType, resolver: Resolver) : String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.associateByTo(mutableMapOf(), ${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries)})"
    }
    fun mapToMap(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>, varName: String, dataMethod: DataMethodInfo, outType:KSType, resolver: Resolver) : String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.associateByTo(mutableMapOf(), ${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries)})"
    }
    fun mapConversion(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>,
                      dataMethodInfo: DataMethodInfo, outTypeName:String, toEntries:Boolean, isNullSave:Boolean=false) : String{
        return if(inArgs.first == outArg.first && inArgs.second == outArg.second){
            if(toEntries){
                "$outTypeName(it.key, it.value)"
            } else {
                "{ it.key }, { it.value }"
            }
        }else if(inArgs.first == outArg.second && inArgs.second == outArg.first){
            if(toEntries){
                "$outTypeName(it.value, it.key)"
            } else {
                "{ it.value }, { it.key }"
            }
        } else if(inArgs.first == outArg.first){
            val convertedCall = dataMethodInfo.getDataCall("it.value", outArg.second.getFullClassName(), isNullSave)
            if(toEntries){
                "$outTypeName(it.key, $convertedCall)"
            } else {
                "{ it.key }, { $convertedCall }"
            }
        } else if(inArgs.first == outArg.second){
            val convertedCall = dataMethodInfo.getDataCall("it.key", outArg.first.getFullClassName(), isNullSave)
            if(toEntries){
                "$outTypeName(it.value, $convertedCall)"
            } else {
                "{ it.value }, { $convertedCall }"
            }
        } else if(inArgs.second == outArg.first){
            val convertedCall = dataMethodInfo.getDataCall("it.value", outArg.second.getFullClassName(), isNullSave)
            if(toEntries){
                "$outTypeName($convertedCall, it.key)"
            } else {
                "{ $convertedCall }, { it.key }"
            }
        } else if(inArgs.second == outArg.second){
            val convertedCall = dataMethodInfo.getDataCall("it.key", outArg.first.getFullClassName(), isNullSave)
            if(toEntries){
                "$outTypeName($convertedCall, it.value)"
            } else {
                "{ $convertedCall }, { it.value }"
            }
        } else {
            val inNames=Pair(inArgs.first.declaration.simpleName.asString(), inArgs.second.declaration.simpleName.asString())
            val outNames=Pair(outArg.first.declaration.simpleName.asString(), outArg.second.declaration.simpleName.asString())
            throw IllegalStateException("map type $outTypeName unknown converstion for map: ${inNames.first} ${inNames.second} -> ${outNames.first} ${outNames.second}")
        }
    }

    fun getMapEntryTypePair(type:KSType, resolver: Resolver): Pair<KSType, KSType>{
        var firstType = type.arguments.firstOrNull()?.type?.resolve()
        var secondType = type.arguments.getOrNull(1)?.type?.resolve()
        if(firstType==null || secondType == null){
            val test = resolver.getKotlinClassByName(type.declaration.qualifiedName!!)
            logger.warn("test ${test?.simpleName?.asString()}")
            test?.getDeclaredProperties()?.forEach {
                if(it.simpleName.asString() == "key"){
                    firstType = it.type.resolve()
                } else if(it.simpleName.asString() == "value"){
                    secondType = it.type.resolve()
                }
            }
            if(firstType==null || secondType == null){
                throw IllegalStateException("map type ${type.declaration.simpleName.asString()} unkown in types for map")
            }
        }
        return Pair(firstType!!, secondType!!)

    }


    private fun convertToMap(
        outType: KSType,
        inType: KSType,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver
    ): String {
        val outKeyType = outType.arguments.first().type?.resolve()
        val outValueType = outType.arguments[1].type?.resolve()
        val inKeyType = inType.arguments.firstOrNull()?.type?.resolve()
        val inValueType = inType.arguments.getOrNull(1)?.type?.resolve()
        if(inType == outType && outKeyType == inKeyType && outValueType == inValueType){
            logger.warn("same map type $varName")
            return varName
        }
        return outKeyType?.let {
            logger.warn("field type: ${it.declaration.simpleName.asString()} ${Type.byType(it, this)} ${Type.byType(inType, this)}")
            when (Type.byType(it, this)) {
                Type.SIMPLE -> {
                    val type = Type.byType(inType, this)
                    if(type == Type.COLLECTION){
                        val inPair = getMapEntryTypePair(inKeyType!!, resolver)
                        val outPair = getMapEntryTypePair(outType, resolver)
                        return collectionToMap(inPair, outPair, varName, dataMethod, outType, resolver)
                    }
                    "emptyMap()"
                } // TODO convert
                Type.COLLECTION -> ""
                Type.MAP -> ""
                Type.MAP_ENTRY -> ""
                Type.ENUM -> ""
                Type.DATA -> {
                    val dataTarget = dataMethod.getDataCall("it", it.getFullClassName())
                    "$varName.map { $dataTarget }"
                }
            }
        } ?: "emptyList()"
    }

    protected fun getTypeString(variable: Map.Entry<String,KSType>): String {
        val type = variable.value
        return when (val typeString = getFullNameForTarget(type, type.declaration.simpleName.asString(), type)) {
            "List" -> {
                val typeArg = type.arguments.first().type?.resolve()
                val typeArgString = typeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val classInfoCache = classInfoCache[it]
                    val typePackage = classInfoCache?.packageName?.let { "$it." } ?: ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "List<$typeArgString>"
            }
            "Map" -> {
                val keyTypeArg = type.arguments.first().type?.resolve()
                val keyTypeArgString = keyTypeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                val valueTypeArg = type.arguments.getOrNull(1)?.type?.resolve()
                val valueTypeArgString = valueTypeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "Map<$keyTypeArgString, $valueTypeArgString>"
            }
            "OneOfType"-> {
                variable.key.capitalizeFirstLetter()
            }
            else -> typeString
        }
    }

    protected fun OutputStream.id(indentation: Int): OutputStream {
        this += " ".repeat(indentation)
        return this
    }

    fun KSType.getDefaultValueForType():String{
        val typeString = this.declaration.simpleName.asString()
        return when (typeString) {
            "Int" -> "0"
            "UInt" -> "0"
            "Long" -> "0L"
            "Float" -> "0.0f"
            "Double" -> "0.0"
            "String" -> "\"\""
            "Boolean" -> "false"
            "List" -> "emptyList()"
            "Map" -> "emptyMap()"
            else -> {
                val fullName = getFullNameForTarget(this, typeString, this)
                if(enumType?.asStarProjectedType()?.isAssignableFrom(this) == true){
                    "$fullName.$UNRECOGNISED_ENUM_NAME"
                }else {
                    "$fullName()"
                }
            }
        }
    }

    operator fun OutputStream.plusAssign(str: String) {
        this.write(str.toByteArray())
    }

    data class ProtoData(
        val classDeclaration: KSClassDeclaration,
        val packageName: String = classDeclaration.packageName.asString(),
        val className: String = classDeclaration.simpleName.asString(),
        val absoluteClassName: String = "$packageName.$className",
        val versionPackage: String = packageName.split('.').last(),
        val parseFunctionName: String = "parseBy$versionPackage",
        val encodeFunctionName: String = "encodeTo$versionPackage",
        val members: Map<String, KSType> = getMembers(classDeclaration)
    )

    enum class Type {
        SIMPLE,
        COLLECTION,
        MAP,
        MAP_ENTRY,
        ENUM,
        DATA;
        companion object {
            fun byType(type: KSType, generator: BaseGenerator): Type {
                val string = type.declaration.simpleName.asString()
                return when (string) {
                    "Byte" -> SIMPLE
                    "Short" -> SIMPLE
                    "Int" -> SIMPLE
                    "UInt" -> SIMPLE
                    "Long" -> SIMPLE
                    "Float" -> SIMPLE
                    "Double" -> SIMPLE
                    "Char" -> SIMPLE
                    "String" -> SIMPLE
                    "Boolean" -> SIMPLE
                    "List" -> COLLECTION
                    "Set" -> COLLECTION
                    "Map" -> MAP
                    else -> {
                        if(generator.enumType?.asStarProjectedType()?.isAssignableFrom(type) == true){
                            ENUM
                        } else if(generator.mapClass?.asStarProjectedType()?.isAssignableFrom(type) == true){
                            MAP_ENTRY
                        } else {
                            DATA
                        }
                    }
                }
            }
        }
    }

    companion object {
        fun getMembers(definition: KSClassDeclaration) = mutableMapOf<String, KSType>().apply {
            definition.declarations.filter { it is KSPropertyDeclaration }
                .associateByTo(this, { it.simpleName.asString() }, { (it as KSPropertyDeclaration).type.resolve() })
        }


        fun String.capitalizeFirstLetter() :String{
            return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    }
}