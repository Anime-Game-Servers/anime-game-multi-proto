
import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.core.annotations.Converters
import java.io.OutputStream
import java.util.*
import kotlin.collections.ArrayList

//TODO keep AddedIn/RemovedIn annotations
@OptIn(KspExperimental::class)
abstract class BaseGenerator(
    val logger: KSPLogger,
    val resolver: Resolver,
    val classInfoCache: MutableMap<KSType, ClassInfo>,
) {
    val enumType = resolver.getKotlinClassByName("kotlin.Enum")
    val mapClass = resolver.getKotlinClassByName("kotlin.collections.Map.Entry")
    val protoEnumType = resolver.getKotlinClassByName("pbandk.Message.Enum")

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
        file += "import ${Version::class.java.canonicalName}\n"+
                "import ${AddedIn::class.java.canonicalName}\n"+
                "import ${RemovedIn::class.java.canonicalName}\n"+
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

    data class OneOfType(
        val name: String,
        val kSType: KSType,
        val altNames : List<String>,
    )

    public data class OneOfData(
        val type: KSType,
        val variableName: String,
        val oneOfTypes: Set<OneOfType>,
        val oneOfClassMap: Map<String, OneOfType>,
        val allowTypeBasedMapping: Boolean = false,
        val wrapperName: String = variableName.capitalizeFirstLetter(),
        val unknownName: String = "Unknown"+variableName.capitalizeFirstLetter()
    ) {
        companion object {
            fun createOneOfData(definition: KSClassDeclaration, type: KSType, variableName: String) : OneOfData {
                val oneOfClasses = mutableSetOf<OneOfType>()
                // TODO OneOfEntry handling with name mapping
                val oneOfClassMap = mutableMapOf<String, OneOfType>()
                var allowTypeBasedMapping = false
                definition.declarations.forEach declarations@{ declaration ->
                    if (declaration.simpleName.asString() != variableName) return@declarations
                    declaration.annotations.forEach { ksAnnotation ->
                        if (ksAnnotation.shortName.asString() == OneOf::class.simpleName) {
                            ksAnnotation.arguments.forEach { ksArgument ->
                                if (ksArgument.name?.asString() == OneOf::types.name) {
                                    val values = (ksArgument.value as? ArrayList<KSAnnotation>) ?: return@forEach
                                    values.forEach { oneOfEntry ->
                                        val names = mutableListOf<String>()
                                        var type: KSType? = null
                                        var mainName: String? = null
                                        oneOfEntry.arguments.forEach { oneOfEntryArgument ->
                                            when(oneOfEntryArgument.name?.asString()){
                                                OneOfEntry::type.name ->
                                                    type = oneOfEntryArgument.value as? KSType
                                                OneOfEntry::name.name ->
                                                    (oneOfEntryArgument.value as? ArrayList<String>)?.let { altnames ->
                                                        names.addAll(altnames)
                                                        mainName = altnames.first()
                                                    }
                                            }
                                        }
                                        type ?: return@forEach
                                        mainName ?: return@forEach
                                        val typeDef = OneOfType(name =  mainName, kSType =  type,
                                            altNames = if(names.size < 2) emptyList() else names.subList(1, names.size))
                                        oneOfClasses.add(typeDef)
                                        names.forEach { name ->
                                            oneOfClassMap[name] = typeDef
                                        }
                                    }
                                }
                                if (ksArgument.name?.asString() == OneOf::allowTypedBasedMapping.name) {
                                    allowTypeBasedMapping = ksArgument.value as Boolean
                                }
                            }
                        }
                    }
                }
                return OneOfData(type, variableName, oneOfClasses, oneOfClassMap, allowTypeBasedMapping)
            }
        }
    }

    public data class ClassInfo(
        val name: String,
        val packageName: String,
        val definition: KSClassDeclaration,
        val dependencies: Set<KSFile>,
        val protoSet: Set<ProtoData>,
        val isProtoModel: Boolean,
        val originalPackage: String = definition.packageName.asString(),
        val modelMembers: Map<String, MemberInfo> = getMembers(definition),
        val oneOfs: Map<String, OneOfData> = modelMembers.filterValues { it.type.declaration.simpleName.asString() == "OneOfType" }
            .entries.associate {
                it.key to OneOfData.createOneOfData(definition, it.value.type, it.value.name)
            },
        val declarations: List<KSClassDeclaration> = definition.declarations.mapNotNull { it as? KSClassDeclaration }.toList(),
        val names: Set<String> = setOf(name)
    )

    protected fun getFullNameForTarget(targetType:MemberInfo, fallback:String, sourceType:MemberInfo?):String{
        return classInfoCache[sourceType?.type]?.let {
            it.packageName + "." + it.name
        } ?: fallback
    }

    protected fun addConstructorMembers(
        indentation: Int,
        sourceMembers: Map<String, MemberInfo>,
        targetMembers: Map<String, MemberInfo>,
        file: OutputStream,
        sourcePrefix: String? = null,
        dataMethod: DataMethodInfo
    ) {
        targetMembers.forEach {
            if (!it.value.isPrimaryConstructorMember){
                return@forEach
            }
            val matching = sourceMembers.values.filter { value -> value.hasSameName(it.value) }
            if (matching.isEmpty()) {
                return@forEach
            }
            if(matching.size > 1){
                logger.warn("multiple matching source members for ${it.key}")
            }
            val sourceMember = matching.first()
            val baseVarName = "`${it.value.name.getVariableName()}`"
            val baseSourceVarName = "`${sourceMember.name.getVariableName()}`"
            val sourceVarName = sourcePrefix?.let {pf -> "$pf.${baseSourceVarName}" } ?: baseSourceVarName

            val type = Type.byType(it.value.type, this)
            file.id(indentation)+= when (type) {
                Type.SIMPLE -> {
                    "$baseVarName = ${
                        convertSimple(
                            it.value,
                            sourceMember,
                            sourceVarName,
                            dataMethod,
                            resolver
                        )
                    },\n"
                }
                Type.COLLECTION -> {
                    "${getFullNameForTarget(it.value, it.value.name, sourceMember)} = ${
                        convertToCollection(
                            it.value,
                            sourceMember,
                            sourceVarName,
                            dataMethod,
                            resolver
                        )
                    },\n"
                }
                Type.BYTE_ARRAY -> "${getFullNameForTarget(it.value, it.value.name, sourceMember)} = ${
                    convertByteArray(
                        it.value,
                        sourceMember,
                        sourceVarName
                    )
                },\n"
                Type.MAP_ENTRY ->  "$baseVarName = ${
                    convertToMap(
                        it.value,
                        sourceMember,
                        sourceVarName,
                        dataMethod,
                        resolver
                    )
                },\n"
                Type.MAP ->  "$baseVarName = ${
                    convertToMap(
                        it.value,
                        sourceMember,
                        sourceVarName,
                        dataMethod,
                        resolver
                    )
                },\n"
                Type.ENUM -> {
                    val (isIn, converter) = checkAndGetConverter(sourceMember, it.value) ?: Pair(false, null)

                    val className = ((if(isIn)converter?.outType else converter?.inType) ?: it.value.type).getFullClassName()
                    "$baseVarName = ${dataMethod.getDataCall(sourceVarName, className, true, converter = converter)},\n"
                }
                Type.DATA -> {
                    "$baseVarName = ${dataMethod.getDataCall(sourceVarName, it.value.type.getFullClassName(), fallback = "null")},\n"
                }
                Type.ONE_OF -> {
                    val wrapperName = it.value.name.capitalizeFirstLetter()
                    //"$baseVarName = ${dataMethod.getDataCall(sourceVarName, wrapperName, fallback="$wrapperName.Unknown$wrapperName")},\n"

                    "$baseVarName = ${dataMethod.getDataCall(sourceVarName, wrapperName, fallback="null")},\n"
                }
            }
        }
    }

    protected fun String.getVariableName():String{
        return this.snakeToLowerCamelCase().replaceFirstChar { it.lowercaseChar() }
    }
    protected fun String.getClassName():String{
        return this.snakeToLowerCamelCase().replaceFirstChar { it.uppercaseChar() }
    }

    private fun convertToCollection(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver
    ): String {
        val outParameter = outType.type.arguments.first().type?.resolve()
            ?: throw IllegalStateException("unknown list param type for var $varName")
        val inParameter = inType.type.arguments.firstOrNull()?.type?.resolve()
        if(inType == outType && inParameter!=null && inParameter == outParameter){
            logger.logging("same list type $varName")
            return varName
        }
        val outParameterName = outParameter.declaration.simpleName.asString()
        val inParameterName = inParameter?.declaration?.simpleName?.asString() ?: ""
        //logger.warn("list equals ${inType == outType} ${outParameter==inParameter}\n\t$outParameterName\t${inParameter?.declaration?.simpleName?.asString()}")
        //logger.warn("field type: $varName $outParameterName ${Type.byType(outParameter, this)} ${Type.byType(inType, this)} o$outParameter i$inParameter\n")
        return when (Type.byType(outParameter, this)) {
            Type.SIMPLE -> {
                checkAndGetConverter(inType, outType, inParameter?: inType.type, outParameter, inParameterName, outParameterName)?.let { (isIn, converter) ->
                    val className = (if(isIn)converter.outType else converter.inType).getFullClassName()
                    val converterFunction = if(className.endsWith(converter.inTypeString)){
                        "inToOut"
                    } else {
                        "outToIn"
                    }
                    val dataTarget = dataMethod.getDataCall("it", outParameterName, true, converter = converter)
                    "$varName.map { ${converter.getFullConverterClassName()}.$converterFunction($dataTarget) }"
                } ?: if(inParameter == outParameter){
                    varName
                } else {// TODO convert
                    logger.warn("simple collections with different types $varName $outParameterName $inParameter")
                    "emptyList()"
                }
            }
            Type.COLLECTION -> "$outParameterName($varName)"
            Type.BYTE_ARRAY -> {
                logger.warn("bytearray collection $varName")
                ""
            }
            Type.MAP -> {
                logger.warn("trying to map map to collection $varName $outParameterName $inParameter")
                ""
            }
            Type.MAP_ENTRY -> {
                val outTypes = getMapEntryTypePair(outParameter,resolver)
                if(Type.byType(inType.type, this) == Type.MAP){
                    val inTypes = getMapEntryTypePair(inType.type, resolver)
                    mapToCollection(inTypes, outTypes, varName, dataMethod, outParameter, resolver)
                } else {
                    ""
                }
            }
            Type.ONE_OF -> {
                logger.warn("trying to map collection with oneoff types $varName $outParameterName $inParameter")
                ""
            }
            Type.DATA , Type.ENUM -> {
                val (isIn, converter) = checkAndGetConverter(inType, outType, inParameter?: inType.type, outParameter, inParameterName, outParameterName) ?: Pair(false, null)

                val className = ((if(isIn)converter?.outType else converter?.inType) ?: outParameter).getFullClassName()
                val dataTarget = dataMethod.getDataCall("it", className, true, converter = converter)
                "$varName.map { $dataTarget }"
            }
        }
    }
    private fun checkAndGetConverter(inType: MemberInfo, outType: MemberInfo,
                                     inKsType: KSType = inType.type, outKsType: KSType = outType.type,
                                     inTypeName: String = inKsType.declaration.simpleName.asString(),
                                     outTypeName: String = outKsType.declaration.simpleName.asString()) : Pair<Boolean, TypeConverter>?{

        val isSame = (classInfoCache[inKsType]?.let { inClassInfo ->
            inClassInfo.names.any { it.equals(outTypeName, ignoreCase = true) }
        } ?: classInfoCache[outKsType]?.let { outClassInfo ->
            outClassInfo.names.any { it.equals(inTypeName, ignoreCase = true) }
        } ?: false) && inType.parentType == outType.parentType

        if(!isSame){
            val outConverters = outType.converters.filter {
                val inConvTypeName = it.inTypeString
                val outConvTypeName = it.outTypeString

                val inClassInfo = classInfoCache[it.inType]
                val inMatchesIn = inClassInfo?.let { inClassInfo ->
                    inClassInfo.names.contains(inTypeName) && inClassInfo.definition.getParentType() == inType.parentType
                } ?: (inConvTypeName == inTypeName)
                val outClassInfo = classInfoCache[it.outType]
                val outMatchesIn = outClassInfo?.let { outClassInfo ->
                    outClassInfo.names.contains(inTypeName) && outClassInfo.definition.getParentType() == inType.parentType
                } ?: (inConvTypeName == outTypeName)
                inMatchesIn && outConvTypeName == outTypeName || outMatchesIn && outConvTypeName == inTypeName
            }
            if(outConverters.isNotEmpty()) {
                return false to outConverters.first()
            }
            val inConverters = inType.converters.filter {
                val inConvTypeName = it.inTypeString
                val outConvTypeName = it.outTypeString
                val inClassInfo = classInfoCache[it.inType]
                val inMatchesOut = inClassInfo?.let { inClassInfo ->
                    inClassInfo.names.contains(outTypeName) && inClassInfo.definition.getParentType() == outType.parentType
                } ?: (inConvTypeName == outTypeName)

                inConvTypeName == inTypeName && outConvTypeName == outTypeName || inMatchesOut && outConvTypeName == inTypeName
            }
            if(inConverters.isNotEmpty()){
                return true to inConverters.first()
            }
        }
        return null
    }

    private fun convertByteArray(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String
    ): String {
        if(inType == outType){
            logger.logging("same ByteArray type $varName")
            return varName
        }
        if(inType.type.declaration.simpleName.asString() == "ByteArr"){
            return "$varName.array"
        } else {
            return "${outType.type.getFullClassName()}($varName)"
        }
    }

    data class DataMethodInfo(val methodName:String,
                              val isMemberCall:Boolean,
                              val overwritePackagePath:String? = null){
        fun getDataCall(variable: String, methodClassPath: String, isNullSafe:Boolean = false, forceNonNull: Boolean = false, fallback: String? = null, converter :TypeConverter? = null ):String{
            val converterFunction = converter?.let {
                if(methodClassPath.endsWith(converter.inTypeString)){
                    "inToOut"
                } else {
                    "outToIn"
                }
            }
            return if (isMemberCall) {
                val accessor = if(isNullSafe) "." else "?."
                converterFunction?.let{
                    "${converter.getFullConverterClassName()}.$converterFunction($variable)$accessor$methodName()"
                } ?:
                "$variable$accessor$methodName()"
            }
            else {
                val classPath =
                    //overwritePackagePath?.let {
                        overwritePackagePath?.split("/")?.let {
                            "${methodClassPath.replaceFirst(it.first(), it[1])}"
                        } ?: methodClassPath
                        //"$it.${methodClassPath.split('.').last()}"
                    //} ?: methodClassPath
                if(isNullSafe){
                    converterFunction?.let{
                        "${converter.getFullConverterClassName()}.$converterFunction($classPath.$methodName($variable))"
                    } ?: "$classPath.$methodName($variable)"
                } else {
                    if(forceNonNull){
                        "$variable!!.let{ member -> $classPath.$methodName(member)}"
                    } else {
                        val fallbackString = if (fallback == "null") "" else " ?: ${fallback ?: classPath}()"
                        "$variable?.let{ member -> $classPath.$methodName(member)}$fallbackString"
                    }
                }
            }
        }
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
        return "$varName.filter {it.value != null}.associateByTo(mutableMapOf(), ${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries, forceNonNullVal = true)})"
    }
    fun mapToMap(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>, varName: String, dataMethod: DataMethodInfo, outType:KSType, resolver: Resolver, isNullSave:Boolean=false) : String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.entries.associateByTo(mutableMapOf(), ${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries, isNullSave = isNullSave)})"
    }
    fun mapConversion(inArgs: Pair<KSType, KSType>, outArg:Pair<KSType, KSType>,
                      dataMethodInfo: DataMethodInfo, outTypeName:String, toEntries:Boolean, isNullSave:Boolean=false, forceNonNullVal:Boolean=false) : String{
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
            val convertedCall = dataMethodInfo.getDataCall("it.value", outArg.second.getFullClassName(), isNullSave, !toEntries && forceNonNullVal)
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
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver
    ): String {
        val outKeyType = outType.type.arguments.first().type?.resolve()
        val outValueType = outType.type.arguments[1].type?.resolve()
        val inKeyType = inType.type.arguments.firstOrNull()?.type?.resolve()
        val inValueType = inType.type.arguments.getOrNull(1)?.type?.resolve()
        if(inType == outType && outKeyType == inKeyType && outValueType == inValueType){
            logger.warn("same map type $varName")
            return varName
        }
        return outKeyType?.let {
            logger.info("field type: ${it.declaration.simpleName.asString()} ${Type.byType(it, this)} ${Type.byType(inType.type, this)}")
            when (Type.byType(it, this)) {
                Type.SIMPLE -> {
                    val type = Type.byType(inType.type, this)
                    if(type == Type.COLLECTION){
                        val inPair = getMapEntryTypePair(inKeyType!!, resolver)
                        val outPair = getMapEntryTypePair(outType.type, resolver)
                        return collectionToMap(inPair, outPair, varName, dataMethod, outType.type, resolver)
                    }
                    if (type == Type.MAP) {
                        val nullable  = inKeyType!!.isMarkedNullable || inValueType!!.isMarkedNullable || outKeyType.isMarkedNullable || outValueType!!.isMarkedNullable
                        return mapToMap(Pair(inKeyType!!, inValueType!!), Pair(outKeyType!!, outValueType!!), varName, dataMethod, outType.type, isNullSave = !nullable, resolver =  resolver)
                    }
                    logger.warn("possible missing map type handling $varName")
                    "emptyMap()"
                } // TODO convert
                Type.BYTE_ARRAY -> {
                    logger.warn("trying to map bytearray to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.COLLECTION -> {
                    logger.warn("trying to map collection to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.MAP -> {
                    logger.warn("trying to map map to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.MAP_ENTRY -> {
                    logger.warn("trying to map mapEntry to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.ENUM -> {
                    logger.warn("trying to map enum to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.ONE_OF -> {
                    logger.warn("trying to map oneof to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
                    ""
                }
                Type.DATA -> {
                    val dataTarget = dataMethod.getDataCall("it", it.getFullClassName())
                    "`$varName`.map { $dataTarget }"
                }
            }
        } ?: run {
            logger.warn("trying to map with outKeyType null to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
            "emptyList()"
        }
    }

    private fun convertSimple(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver): String{
        val inTypeCategory = Type.byType(inType.type, this)
        if(outType.type.getFullClassName() == "kotlin.Int" && inTypeCategory == Type.ENUM){
            return "$varName.${dataMethod.methodName}().value"
        }
        checkAndGetConverter(inType, outType)?.let { (isIn, converter) ->
            val className = (if(isIn)converter.outType else converter.inType).getFullClassName()
            val converterFunction = if(className.endsWith(converter.inTypeString)){
                "inToOut"
            } else {
                "outToIn"
            }
            return "${converter.getFullConverterClassName()}.$converterFunction($varName)"
        }
        return "$varName"
    }

    protected fun getTypeString(variable: Map.Entry<String,MemberInfo>): String {
        val type = variable.value.type
        /*return when (val typeString = getFullNameForTarget(type, type.declaration.simpleName.asString(), type)) {
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
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                val valueTypeArg = type.arguments.getOrNull(1)?.type?.resolve()
                val valueTypeArgString = valueTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "Map<$keyTypeArgString, $valueTypeArgString>"
            }
            "OneOfType"-> {
                "${variable.key.capitalizeFirstLetter()}<*>"
            }
            else -> typeString
        }*/
        val typeEnum = Type.byType(type, this)
        val typeString = getFullNameForTarget(variable.value, type.declaration.simpleName.asString(), variable.value)
        return when (typeEnum) {
            Type.COLLECTION -> {
                val typeArg = type.arguments.first().type?.resolve()
                val typeArgString = typeArg?.let {
                    //val typePackage = it.declaration?.packageName?.asString()?.let { "$it." } ?: ""
                    val classInfoCache = classInfoCache[it]
                    val typePackage = classInfoCache?.packageName?.let { "$it." } ?: ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "List<$typeArgString>"
            }
            Type.MAP -> {
                val keyTypeArg = type.arguments.first().type?.resolve()
                val keyTypeArgString = keyTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                val valueTypeArg = type.arguments.getOrNull(1)?.type?.resolve()
                val valueTypeArgString = valueTypeArg?.let {
                    val classInfo = classInfoCache[it]
                    val typePackage = classInfo?.packageName?.let { packageName -> "$packageName." } ?: ""
                    //val typePackage = ""
                    "$typePackage${it.declaration.simpleName.asString()}"
                } ?: "Any"
                "Map<$keyTypeArgString, $valueTypeArgString>"
            }
            Type.ONE_OF-> {
                "${variable.value.name.capitalizeFirstLetter()}<*>?"
            }
            Type.DATA -> {
                "$typeString?"
            }
            else -> typeString
        }
    }

    protected fun OutputStream.id(indentation: Int): OutputStream {
        this += " ".repeat(indentation)
        return this
    }

    fun MemberInfo.getDefaultValueForType(oneOfData: OneOfData?=null):String{
        val typeString = this.type.declaration.simpleName.asString()
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
            "ByteArray" -> "ByteArray(0)"
            "OneOfType" -> {
                "null"
                /*oneOfData?.let {
                    "${it.wrapperName}.${it.unknownName}()"
                } ?: run {
                    logger.warn("no one of data for type $typeString")
                    "typeString()"
                }*/
            }
            else -> {

                val fullName = getFullNameForTarget(this, typeString, this)
                if(enumType?.asStarProjectedType()?.isAssignableFrom(this.type) == true){
                    "$fullName.$UNRECOGNISED_ENUM_NAME"
                }else {
                    //"$fullName()"
                    "null"
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
        val protoPackageName: String = packageName,
        val className: String = classDeclaration.simpleName.asString(),
        val absoluteClassName: String = "$packageName.$className",
        val versionPackage: String = protoPackageName.split('.').last(),
        val parseFunctionName: String = "parseBy$versionPackage",
        val encodeFunctionName: String = "encodeTo$versionPackage",
        val members: Map<String, MemberInfo> = getMembers(classDeclaration)
    )

    enum class Type {
        SIMPLE,
        BYTE_ARRAY,
        COLLECTION,
        MAP,
        MAP_ENTRY,
        ENUM,
        ONE_OF,
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
                    "ByteArray" -> BYTE_ARRAY
                    "ByteArr" -> BYTE_ARRAY
                    "List" -> COLLECTION
                    "Set" -> COLLECTION
                    "Map" -> MAP
                    "OneOfType" -> ONE_OF
                    else -> {
                        if(generator.enumType?.asStarProjectedType()?.isAssignableFrom(type) == true || generator.protoEnumType?.asStarProjectedType()?.isAssignableFrom(type) == true){
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
        fun KSPropertyDeclaration.getNames(): List<String>{
            val names = mutableListOf(simpleName.asString())
            getAnnotationsByType(AltName::class).forEach { altname ->
                names.addAll(altname.altNames)
            }

            return names
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


        fun KSPropertyDeclaration.isPropertyInConstructor(classDec: KSClassDeclaration): Boolean {
            if(classDec.classKind == ClassKind.INTERFACE){
                return true
            }

            val primaryConstructor = classDec.primaryConstructor ?: return false
            val names = this.getNames()
            val constructorParameters = primaryConstructor.parameters.filter { it.name?.asString() in names }
            return constructorParameters.isNotEmpty()
        }

        data class MemberInfo(val name: String, val names: List<String>, val type: KSType, val isPrimaryConstructorMember: Boolean = false, val converters: List<TypeConverter>,
            val parentType: String? = type.getParentType()){
            fun hasSameName(other: MemberInfo): Boolean {
                return names.any { name -> other.names.any { it.equals(name, ignoreCase = true) } }
            }
        }
        fun KSType.getParentType() : String?{
            return declaration.getParentType();
        }
        fun KSDeclaration.getParentType() : String?{
            return parentDeclaration?.simpleName?.asString() ?: run {
                try {
                    getAnnotationsByType(ProtoModel::class).firstOrNull()?.let { protoModel ->
                        return protoModel.parentClass
                    }
                    getAnnotationsByType(ProtoEnum::class).firstOrNull()?.let { protoModel ->
                        return protoModel.parentClass
                    }
                }catch (ex: Exception){}
                null
            }
        }
        fun getMembers(definition: KSClassDeclaration) = mutableMapOf<String, MemberInfo>().apply {
            definition.declarations.mapNotNull { (it as? KSPropertyDeclaration)?.let { declaration ->
                if(definition.classKind == ClassKind.ENUM_CLASS && declaration.simpleName.asString() == "entries"){
                    null
                } else declaration
            } }
                .associateByTo(this, { it.simpleName.asString().lowercase() },
                    { property ->
                        MemberInfo(property.simpleName.asString(), property.getNames(), property.type.resolve(), property.isPropertyInConstructor(definition), property.getConverters())
                })
        }


        class TypeConverter(val type: KSType){
            val inType: KSType
            val outType: KSType
            val inTypeString: String
            val outTypeString: String
            init {
                val typeArgs = type.declaration.annotations.first().arguments
                inType = typeArgs.first().value as KSType
                outType = typeArgs.getOrNull(1)?.value as KSType
                inTypeString = inType.declaration.simpleName.asString()
                outTypeString = outType.declaration.simpleName.asString()
            }
            fun getFullConverterClassName():String{
                return type.getFullClassName()
            }
        }

        fun KSPropertyDeclaration.getConverters(): List<TypeConverter>{
            return annotations.filter { it.shortName.asString() == Converters::class.java.simpleName }
                .flatMap { it.arguments.flatMap { args -> args.value as ArrayList<KSType> } }
                .map { TypeConverter(it) }.toList()
        }


        fun String.capitalizeFirstLetter() :String{
            return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }


        val snakeRegex = "_[a-zA-Z]".toRegex()
        fun String.snakeToLowerCamelCase(): String {
            return snakeRegex.replace(this) {
                it.value.replace("_","")
                    .uppercase()
            }
        }
        fun String.snakeToUpperCamelCase(): String {
            return this.snakeToLowerCamelCase().capitalizeFirstLetter()
        }

        fun compareIgnoreCase(memberName: String, oneOfName: String) : Boolean{
            return memberName.snakeToLowerCamelCase().equals(oneOfName.snakeToLowerCamelCase(), true)
        }
    }
}