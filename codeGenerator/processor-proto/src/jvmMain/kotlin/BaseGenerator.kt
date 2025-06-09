import processor.common.Generator
import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.multi_proto.gi.interfaces.VersionedEnumHandler
import org.anime_game_servers.multi_proto.gi.interfaces.VersionedMessageHandler
import java.io.OutputStream
import java.util.*
import kotlin.collections.ArrayList

//TODO keep AddedIn/RemovedIn annotations
@OptIn(KspExperimental::class)
abstract class BaseGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>,
): Generator(logger, resolver, classInfoCache) {

    override fun createClassForProto(file: OutputStream, classInfo: ClassInfo) {
        file += "package ${classInfo.packageName}\n"
        addImports(file, classInfo)
        addConstructor(file, classInfo)
        addBody(file, classInfo)
        addEncodeMethods(file, classInfo)
        addCompanionObject(file, classInfo)
        addClosure(file, classInfo)
        file.close()
    }

    open fun getModelClass(classInfo: ClassInfo): String {
        return "${classInfo.originalPackage.replaceFirst(".data.", ".messages.")}.${classInfo.name}"
    }

    open fun addImports(file: OutputStream, classInfo: ClassInfo) {
        file +=
//                "import ${AddedIn::class.java.canonicalName}\n" +
//                "import ${RemovedIn::class.java.canonicalName}\n" +
                "import ${VersionedMessageHandler::class.java.canonicalName}\n" +
                "import ${VersionedEnumHandler::class.java.canonicalName}\n" +
                "import kotlin.jvm.JvmStatic\n" +
                "import kotlin.jvm.JvmOverloads\n"
    }

    open fun addConstructor(file: OutputStream, classInfo: ClassInfo) {
        //add the kdoc if it exists //TODO
        classInfo.definition.docString?.let {
            file += "/**${it.replace("\n", "\n  * ")}*/\n"
        }
    }

    open fun addBody(file: OutputStream, classInfo: ClassInfo) {

    }

    open fun addEncodeMethods(file: OutputStream, classInfo: ClassInfo) {

    }

    open fun addParsingMethods(file: OutputStream, classInfo: ClassInfo) {
    }

    open fun addCompanionObject(file: OutputStream, classInfo: ClassInfo) {
        file.id(4) += "companion object {\n"
        addParsingMethods(file, classInfo)
        file.id(4) += "}\n"
    }

    open fun addClosure(file: OutputStream, classInfo: ClassInfo) {}

    protected fun String.getVariableName(): String {
        return this.snakeToLowerCamelCase().replaceFirstChar { it.lowercaseChar() }
    }

    protected fun String.getClassName(): String {
        return this.snakeToLowerCamelCase().replaceFirstChar { it.uppercaseChar() }
    }

    protected fun convertToCollection(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String,
        dataMethod: DataMethodInfo,
        resolver: Resolver
    ): String {
        val outParameter = outType.type.arguments.first().type?.resolve()
            ?: throw IllegalStateException("unknown list param type for var $varName")
        val inParameter = inType.type.arguments.firstOrNull()?.type?.resolve()
        if (inType == outType && inParameter != null && inParameter == outParameter) {
            logger.logging("same list type $varName")
            return varName
        }
        val outParameterName = outParameter.declaration.simpleName.asString()
        val inParameterName = inParameter?.declaration?.simpleName?.asString() ?: ""

        //logger.warn("list equals ${inType == outType} ${outParameter==inParameter}\n\t$outParameterName\t${inParameter?.declaration?.simpleName?.asString()}")
        //logger.warn("field type: $varName $outParameterName ${Type.byType(outParameter, this)} ${Type.byType(inType, this)} o$outParameter i$inParameter\n")
        return when (Type.byType(outParameter, this)) {
            Type.SIMPLE -> {
                checkAndGetConverter(
                    inType,
                    outType,
                    inParameter ?: inType.type,
                    outParameter,
                    inParameterName,
                    outParameterName
                )?.let { (isIn, converter) ->
                    val className = (if (isIn) converter.outType else converter.inType).getFullClassName()
                    val mapper = applyConverter(className, converter, "it")
                    "$varName.map { $mapper }"
                } ?: if (inParameter == outParameter) {
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
                val outTypes = getMapEntryTypePair(outParameter, resolver)
                if (Type.byType(inType.type, this) == Type.MAP) {
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

            Type.DATA, Type.ENUM -> {
                val (isIn, converter) = checkAndGetConverter(
                    inType,
                    outType,
                    inParameter ?: inType.type,
                    outParameter,
                    inParameterName,
                    outParameterName
                ) ?: Pair(false, null)

                val className = (if (isIn) converter?.outType else converter?.inType)?.getFullClassName()
                    ?: outParameterName

                // TODO: find a better way
                val overrideDataMethod = converter?.let {
                    DataMethodInfo(
                        if (dataMethod.className == converter.inTypeString) converter.outTypeString else converter.inTypeString,
                        dataMethod.methodName
                    )
                } ?: dataMethod

                val mapper = if (converter == null || className.endsWith(converter.inTypeString)) {
//                        "inToOut" - convert to model first, then apply converter
                    val input = overrideDataMethod.getDataCall("it", true)
                    applyConverter(className, converter, input)
                } else {
//                        "outToIn" - proto -> model first
                    val input = applyConverter(className, converter, "it")
                    overrideDataMethod.getDataCall(input, true)
                }

                "$varName.map { $mapper }"
            }
        }
    }

    private fun checkAndGetConverter(
        inType: MemberInfo, outType: MemberInfo,
        inKsType: KSType = inType.type, outKsType: KSType = outType.type,
        inTypeName: String = inKsType.declaration.simpleName.asString(),
        outTypeName: String = outKsType.declaration.simpleName.asString()
    ): Pair<Boolean, TypeConverter>? {

        val isSame = classInfoCache[inKsType]?.let { inClassInfo ->
            inClassInfo.names.any { it.equals(outTypeName, ignoreCase = true) }
        } ?: classInfoCache[outKsType]?.let { outClassInfo ->
            outClassInfo.names.any { it.equals(inTypeName, ignoreCase = true) }
        } ?: false

        if (!isSame) {
            val outConverters = outType.converters.filter {
                val inConvTypeName = it.inTypeString
                val outConvTypeName = it.outTypeString
                inConvTypeName == inTypeName && outConvTypeName == outTypeName || inConvTypeName == outTypeName && outConvTypeName == inTypeName
            }
            if (outConverters.isNotEmpty()) {
                return false to outConverters.first()
            }
            val inConverters = inType.converters.filter {
                val inConvTypeName = it.inTypeString
                val outConvTypeName = it.outTypeString
                inConvTypeName == inTypeName && outConvTypeName == outTypeName || inConvTypeName == outTypeName && outConvTypeName == inTypeName
            }
            if (inConverters.isNotEmpty()) {
                return true to inConverters.first()
            }
        }
        return null
    }

    private fun applyConverter(className: String, converter: TypeConverter?, input: String): String {
        if (converter == null) return input

        val converterFunction = converter.let {
            if (className.endsWith(converter.inTypeString)) {
                "inToOut"
            } else {
                "outToIn"
            }
        }

        return "${converter.getFullConverterClassName()}.$converterFunction($input)"
    }

    protected fun convertByteArray(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String
    ): String {
        if (inType == outType) {
            logger.logging("same ByteArray type $varName")
            return varName
        }
        if (inType.type.declaration.simpleName.asString() == "ByteArr") {
            return "$varName.array"
        } else {
            return "${outType.type.getFullClassName()}($varName)"
        }
    }

    data class DataMethodInfo(val className: String?, val methodName: String) {
        fun getDataCall(
            variable: String,
            isNullSafe: Boolean = false,
            forceNonNull: Boolean = false,
            noFallback: Boolean = false,
        ): String {
            return if (className == null)
                variable
            else if (isNullSafe) {
                "$className.$methodName($variable)"
            } else {
                if (forceNonNull) {
                    "$variable!!.let { $className.$methodName(it) }"
                } else {
                    val fallbackString = "" //if (noFallback || fallbackMethod == null) "" else " ?: $fallbackMethod()"
                    "$variable?.let { $className.$methodName(it) }$fallbackString"
                }
            }
        }
    }


    fun collectionToCollection(
        inArgs: Pair<KSType, KSType>,
        outArg: Pair<KSType, KSType>,
        varName: String,
        dataMethod: DataMethodInfo,
        outType: KSType,
        resolver: Resolver
    ): String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.map {${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries)}}"
    }

    fun mapToCollection(
        inArgs: Pair<KSType, KSType>,
        outArg: Pair<KSType, KSType>,
        varName: String,
        dataMethod: DataMethodInfo,
        outType: KSType,
        resolver: Resolver
    ): String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.map {${mapConversion(inArgs, outArg, dataMethod, outTypeName, toEntries, true)}}"
    }

    fun collectionToMap(
        inArgs: Pair<KSType, KSType>,
        outArg: Pair<KSType, KSType>,
        varName: String,
        dataMethod: DataMethodInfo,
        outType: KSType,
        resolver: Resolver
    ): String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.filter {it.value != null}.associateByTo(mutableMapOf(), ${
            mapConversion(
                inArgs,
                outArg,
                dataMethod,
                outTypeName,
                toEntries,
                forceNonNullVal = true
            )
        })"
    }

    fun mapToMap(
        inArgs: Pair<KSType, KSType>,
        outArg: Pair<KSType, KSType>,
        varName: String,
        dataMethod: DataMethodInfo,
        outType: KSType,
        resolver: Resolver,
        isNullSave: Boolean = false
    ): String {
        val outTypeName = outType.getFullClassName()
        val toEntries = Type.byType(outType, this) == Type.MAP_ENTRY
        return "$varName.entries.associateByTo(mutableMapOf(), ${
            mapConversion(
                inArgs,
                outArg,
                dataMethod,
                outTypeName,
                toEntries,
                isNullSave = isNullSave
            )
        })"
    }

    fun mapConversion(
        inArgs: Pair<KSType, KSType>,
        outArg: Pair<KSType, KSType>,
        dataMethodInfo: DataMethodInfo,
        outTypeName: String,
        toEntries: Boolean,
        isNullSave: Boolean = false,
        forceNonNullVal: Boolean = false
    ): String {
        return if (inArgs.first == outArg.first && inArgs.second == outArg.second) {
            if (toEntries) {
                "$outTypeName(it.key, it.value)"
            } else {
                "{ it.key }, { it.value }"
            }
        } else if (inArgs.first == outArg.second && inArgs.second == outArg.first) {
            if (toEntries) {
                "$outTypeName(it.value, it.key)"
            } else {
                "{ it.value }, { it.key }"
            }
        } else if (inArgs.first == outArg.first) {
            val convertedCall = dataMethodInfo.getDataCall(
                "it.value",
//                outArg.second.getFullClassName(),
                isNullSave,
                !toEntries && forceNonNullVal
            )
            if (toEntries) {
                "$outTypeName(it.key, $convertedCall)"
            } else {
                "{ it.key }, { $convertedCall }"
            }
        } else if (inArgs.first == outArg.second) {
            val convertedCall = dataMethodInfo.getDataCall(
                "it.key",
//                outArg.first.getFullClassName(),
                isNullSave
            )
            if (toEntries) {
                "$outTypeName(it.value, $convertedCall)"
            } else {
                "{ it.value }, { $convertedCall }"
            }
        } else if (inArgs.second == outArg.first) {
            val convertedCall = dataMethodInfo.getDataCall(
                "it.value",
//                outArg.second.getFullClassName(),
                isNullSave
            )
            if (toEntries) {
                "$outTypeName($convertedCall, it.key)"
            } else {
                "{ $convertedCall }, { it.key }"
            }
        } else if (inArgs.second == outArg.second) {
            val convertedCall = dataMethodInfo.getDataCall(
                "it.key",
//                outArg.first.getFullClassName(),
                isNullSave
            )
            if (toEntries) {
                "$outTypeName($convertedCall, it.value)"
            } else {
                "{ $convertedCall }, { it.value }"
            }
        } else {
            val inNames =
                Pair(inArgs.first.declaration.simpleName.asString(), inArgs.second.declaration.simpleName.asString())
            val outNames =
                Pair(outArg.first.declaration.simpleName.asString(), outArg.second.declaration.simpleName.asString())
            throw IllegalStateException("map type $outTypeName unknown converstion for map: ${inNames.first} ${inNames.second} -> ${outNames.first} ${outNames.second}")
        }
    }

    fun getMapEntryTypePair(type: KSType, resolver: Resolver): Pair<KSType, KSType> {
        var firstType = type.arguments.firstOrNull()?.type?.resolve()
        var secondType = type.arguments.getOrNull(1)?.type?.resolve()
        if (firstType == null || secondType == null) {
            val test = resolver.getKotlinClassByName(type.declaration.qualifiedName!!)
            test?.getDeclaredProperties()?.forEach {
                if (it.simpleName.asString() == "key") {
                    firstType = it.type.resolve()
                } else if (it.simpleName.asString() == "value") {
                    secondType = it.type.resolve()
                }
            }
            if (firstType == null || secondType == null) {
                throw IllegalStateException("map type ${type.declaration.simpleName.asString()} unkown in types for map")
            }
        }
        return Pair(firstType!!, secondType!!)

    }


    protected fun convertToMap(
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
        if (inType == outType && outKeyType == inKeyType && outValueType == inValueType) {
            logger.warn("same map type $varName")
            return varName
        }
        return outKeyType?.let {
            logger.info(
                "field type: ${it.declaration.simpleName.asString()} ${Type.byType(it, this)} ${
                    Type.byType(
                        inType.type,
                        this
                    )
                }"
            )
            when (Type.byType(it, this)) {
                Type.SIMPLE -> {
                    val type = Type.byType(inType.type, this)
                    if (type == Type.COLLECTION) {
                        val inPair = getMapEntryTypePair(inKeyType!!, resolver)
                        val outPair = getMapEntryTypePair(outType.type, resolver)
                        return collectionToMap(inPair, outPair, varName, dataMethod, outType.type, resolver)
                    }
                    if (type == Type.MAP) {
                        val nullable =
                            inKeyType!!.isMarkedNullable || inValueType!!.isMarkedNullable || outKeyType.isMarkedNullable || outValueType!!.isMarkedNullable
                        return mapToMap(
                            Pair(inKeyType!!, inValueType!!),
                            Pair(outKeyType!!, outValueType!!),
                            varName,
                            dataMethod,
                            outType.type,
                            isNullSave = !nullable,
                            resolver = resolver
                        )
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
                    val dataTarget = dataMethod.getDataCall(
                        "it",
//                        it.getFullClassName()
                    )
                    "`$varName`.map { $dataTarget }"
                }
            }
        } ?: run {
            logger.warn("trying to map with outKeyType null to map $varName $outKeyType:$outValueType $inKeyType:$inValueType")
            "emptyList()"
        }
    }

    protected fun convertSimple(
        outType: MemberInfo,
        inType: MemberInfo,
        varName: String,
    ): String {
        checkAndGetConverter(inType, outType)?.let { (isIn, converter) ->
            val className = (if (isIn) converter.outType else converter.inType).getFullClassName()
            applyConverter(className, converter, varName)
        }
        return varName
    }

    protected fun OutputStream.id(indentation: Int): OutputStream {
        this += " ".repeat(indentation)
        return this
    }

    operator fun OutputStream.plusAssign(str: String) {
        this.write(str.toByteArray())
    }

    companion object {
        val snakeRegex = "_[a-zA-Z]".toRegex()
        fun String.snakeToLowerCamelCase(): String {
            return snakeRegex.replace(this) {
                it.value.replace("_", "")
                    .uppercase()
            }
        }

        fun String.snakeToUpperCamelCase(): String {
            return this.snakeToLowerCamelCase().capitalizeFirstLetter()
        }

        fun compareIgnoreCase(memberName: String, oneOfName: String): Boolean {
            return memberName.snakeToLowerCamelCase().equals(oneOfName.snakeToLowerCamelCase(), true)
        }
    }
}