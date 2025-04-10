import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSType
import org.anime_game_servers.multi_proto.core.interfaces.ProtoModel
import org.anime_game_servers.multi_proto.core.interfaces.ProtoModelDecoder
import java.io.OutputStream

open class DataGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>
) : BaseGenerator(logger, resolver, classInfoCache) {

    private fun getProtoData(classInfo: ClassInfo): ProtoData? {
        // TODO: this should not be a list
        return classInfo.protoSet.firstOrNull()
    }

    override fun getModelClass(classInfo: ClassInfo): String {
        return "Model"
    }

    private fun getProtoClassName(className: String): String {
        return className
            .replaceFirst(".gi.data.", ".proto.")
            .replaceFirst(".gi.messages.", ".proto.")
    }

    private fun resolveInnerTypes(type: KSType): List<KSType> {
        val mappingType = Type.byType(type, this)
        when (mappingType) {
            Type.SIMPLE,
            Type.BYTE_ARRAY,
            Type.MAP_ENTRY,
            Type.ONE_OF -> {
                return listOf()
            }

            Type.MAP -> {
                return type.arguments.getOrNull(1)?.type?.resolve()
                    ?.let { resolveInnerTypes(it) }
                    .orEmpty()
            }

            Type.COLLECTION -> {
                return type.arguments.firstOrNull()?.type?.resolve()
                    ?.let { resolveInnerTypes(it) }
                    .orEmpty()
            }

            Type.ENUM,
            Type.DATA -> {
                return listOf(type)
            }
        }
    }

    override fun addImports(file: OutputStream, classInfo: ClassInfo) {
        super.addImports(file, classInfo)
        file += "import ${ProtoModel::class.java.canonicalName}\n" +
                "import ${ProtoModelDecoder::class.java.canonicalName}\n" +
                "import pbandk.decodeFromByteArray\n" +
                "import pbandk.encodeToByteArray\n" +
                "import $PROTO_ONE_OF_ANNOTATION\n"

        val innerOneOfTypes = classInfo.oneOfs.values.flatMap { oneOfData ->
            oneOfData.oneOfClassMap.mapNotNull { (_, oneOfClass) ->
                classInfoCache[oneOfClass]?.let { "${it.packageName}.${it.name}" }
            }
        }

        val memberTypes = classInfo.modelMembers
            .flatMap { (_, info) -> resolveInnerTypes(info.type) }
            .map { getProtoClassName(it.getFullClassName()) }

        val convertMemberTypes = classInfo.modelMembers.flatMap { (_, member) ->
            val innerType = resolveInnerTypes(member.type).firstOrNull() ?: return@flatMap listOf<String>()
            val innerTypeString = innerType.declaration.simpleName.asString()

            member.converters
                .mapNotNull {
                    when (innerTypeString) {
                        it.inTypeString -> it.outType
                        it.outTypeString -> it.inType
                        // filter out irrelevant type converters
                        else -> null
                    }
                }
                .map { getProtoClassName(it.getFullClassName()) }
        }

        val dependencies = innerOneOfTypes + memberTypes + convertMemberTypes
        dependencies.toSet().forEach { className -> file += "import $className\n" }

        file += "import ${super.getModelClass(classInfo)} as ${this.getModelClass(classInfo)}\n"
        getProtoData(classInfo)?.let { proto ->
            file += "import ${proto.absoluteClassName} as Proto\n"
        }
    }


    override fun addConstructor(file: OutputStream, classInfo: ClassInfo) {
        val modelClass = getModelClass(classInfo)
        file += "abstract class ${classInfo.name}: VersionedMessageHandler<${modelClass}> {\n"
    }

    private fun matchOneOfMember(
        fieldNames: List<String>,
        oneOfClass: ClassInfo,
        protoMember: MemberInfo
    ): Boolean {
        return fieldNames.any {
            compareIgnoreCase(protoMember.name, it)
        } && protoMember.type.starProjection().declaration.simpleName.asString()
            .equals(oneOfClass.name, true)
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        val modelClass = getModelClass(classInfo)
        classInfo.oneOfs.values.forEach { oneOfData ->
            logger.info("OneOf: $oneOfData")
            // TODO: resolve name conflicts
            val oneOfClassMap = oneOfData.oneOfClassMap.mapValues { classInfoCache[it.value] }

            file.id(4) += "private abstract class ${oneOfData.wrapperName} {\n"

            getProtoData(classInfo)?.let protoSetFor@{ protoData ->
                // check that the oneOf variable is actually part of the proto
                if (protoData.members.values.none {
                        it.isPrimaryConstructorMember && it.name.equals(
                            oneOfData.variableName,
                            true
                        )
                    }) {
                    return@protoSetFor
                }

                val protoClass = "Proto"
                val subClass = oneOfData.wrapperName
                file.id(8) += "companion object {\n"
                file.id(12) += "@JvmStatic\n"
                file.id(12) += "fun convertModelToProto(model: $modelClass.$subClass<*>): $protoClass.$subClass<*>? {\n"
                file.id(16) += "return when (model) {\n"
                oneOfClassMap.forEach { (fieldNames, oneOfClass) ->
                    if (oneOfClass == null) return@forEach
                    protoData.members.forEach { member ->
                        val className =
                            if (oneOfData.allowTypeBasedMapping) oneOfClass.name else fieldNames.first().getClassName()
                        if (matchOneOfMember(fieldNames, oneOfClass, member.value)) {
                            val value =
                                if (oneOfClass.isProtoModel) "${oneOfClass.name}.convertModelToProto(model.value)" else "model.value"
                            file.id(20) += "is $modelClass.$subClass.$className -> {\n"
                            file.id(24) += "$protoClass.$subClass.${member.value.name.capitalizeFirstLetter()}($value)\n"
                            file.id(20) += "}\n"
                        }
                    }
                }
                file.id(20) += "else -> null\n"
                file.id(16) += "}\n"
                file.id(12) += "}\n"

                file.id(12) += "@JvmStatic\n"
                file.id(12) += "fun convertProtoToModel(proto: $protoClass.$subClass<*>): $modelClass.$subClass<*> {\n"
                file.id(16) += "return when (proto) {\n"
                oneOfClassMap.forEach { (fieldNames, oneOfClass) ->
                    if (oneOfClass == null) return@forEach
                    protoData.members.forEach { (_, member) ->
                        val className =
                            if (oneOfData.allowTypeBasedMapping) oneOfClass.name else fieldNames.first().getClassName()
                        if (matchOneOfMember(fieldNames, oneOfClass, member)) {
                            val value =
                                if (oneOfClass.isProtoModel) "${oneOfClass.name}.convertProtoToModel(proto.value)" else "proto.value"
                            file.id(20) += "is $protoClass.$subClass.${member.name.capitalizeFirstLetter()} -> \n"
                            file.id(24) += "$modelClass.$subClass.$className($value)\n"
                        }
                    }
                }
                file.id(20) += "else ->\n"
                file.id(24) += "$modelClass.$subClass.${oneOfData.unknownName}()\n"
                file.id(16) += "}\n"
                file.id(12) += "}\n"
                file.id(8) += "}\n"
            }

            file.id(4) += "}\n"
        }
    }

    override fun addCompanionObject(file: OutputStream, classInfo: ClassInfo) {
        getProtoData(classInfo)?.let { proto ->
            val modelClass = getModelClass(classInfo)
            val protoClass = "Proto"
            val protoMembers = proto.members

            file.id(4) += "companion object: VersionedMessageHandler<$modelClass> {\n"
            file.id(8) += "@JvmStatic\n"
            file.id(8) += "override fun encodeToByteArray(model: $modelClass): ByteArray {\n"
            file.id(12) += "val proto = convertModelToProto(model)\n"
            file.id(12) += "return proto.encodeToByteArray()\n"
            file.id(8) += "}\n"

            file.id(8) += "@JvmStatic\n"
            file.id(8) += "override fun decodeFromByteArray(byteArray: ByteArray): $modelClass {\n"
            file.id(12) += "val proto = $protoClass.decodeFromByteArray(byteArray)\n"
            file.id(12) += "return convertProtoToModel(proto)\n"
            file.id(8) += "}\n"

            file.id(8) += "@JvmStatic\n"
            file.id(8) += "internal fun convertModelToProto(model: $modelClass) = $protoClass(\n"
            protoMembers.forEach { (_, protoMember) ->
                val modelMember = matchMember(protoMember, classInfo.modelMembers)
                modelMember?.let {
                    file.id(12) += generateConstructorMember(
                        modelMember,
                        protoMember,
                        getModelType(modelMember),
                        "model",
                        "convertModelToProto",
                    )
                }
            }
            file.id(8) += ")\n"

            file.id(8) += "@JvmStatic\n"
            file.id(8) += "internal fun convertProtoToModel(proto: $protoClass) = $modelClass(\n"
            classInfo.modelMembers.forEach { (_, modelMember) ->
                val protoMember = matchMember(modelMember, protoMembers)
                protoMember?.let {
                    file.id(12) += generateConstructorMember(
                        protoMember,
                        modelMember,
                        getModelType(modelMember),
                        "proto",
                        "convertProtoToModel",
                    )
                }
            }
            file.id(8) += ")\n"
            file.id(4) += "}\n"
        }
    }

    override fun addClosure(file: OutputStream, classInfo: ClassInfo) {
        file += "}\n"
    }

    private fun matchMember(
        target: MemberInfo,
        source: Map<String, MemberInfo>
    ): MemberInfo? {
        if (!target.isPrimaryConstructorMember) {
            return null
        }
        val matching = source.values.filter { value -> value.hasSameName(target) }
        if (matching.size > 1) {
            logger.warn("multiple matching source members for ${target.name}")
        }
        return matching.firstOrNull()
    }

    private fun getModelType(type: KSType): String? {
        return when (Type.byType(type, this)) {
            Type.SIMPLE, Type.BYTE_ARRAY -> null
            Type.COLLECTION ->
                type.arguments.firstOrNull()?.type?.resolve()?.let { getModelType(it) }

            Type.MAP ->
                type.arguments.getOrNull(1)?.type?.resolve()?.let { getModelType(it) }

            Type.MAP_ENTRY,
            Type.ONE_OF -> null

            Type.ENUM,
            Type.DATA ->
                type.declaration.simpleName.asString()
        }
    }

    private fun getModelType(modelMember: MemberInfo): String? {
        return when (Type.byType(modelMember.type, this)) {
            Type.ONE_OF -> modelMember.name.capitalizeFirstLetter()
            else -> getModelType(modelMember.type)
        }
    }

    private fun generateConstructorMember(
        sourceMember: MemberInfo,
        targetMember: MemberInfo,
        modelType: String?,
        sourcePrefix: String,
        convertFuncName: String,
    ): String {
        val baseVarName = "`${targetMember.name.getVariableName()}`"
        val baseSourceVarName = "`${sourceMember.name.getVariableName()}`"
        val sourceVarName = "$sourcePrefix.${baseSourceVarName}"

        val sourceTypeCategory = Type.byType(sourceMember.type, this)
        val targetTypeCategory = Type.byType(targetMember.type, this)
        if (targetMember.type.getFullClassName() == "kotlin.Int" && sourceTypeCategory == Type.ENUM) {
            return "$baseVarName = $modelType.encodeValue($sourceVarName),\n"
        }
        if (sourceMember.type.getFullClassName() == "kotlin.Int" && targetTypeCategory == Type.ENUM) {
            return "$baseVarName = $modelType.decodeValue($sourceVarName),\n"
        }

        val dataMethod = DataMethodInfo(modelType, convertFuncName)
        val type = Type.byType(targetMember.type, this)

        return when (type) {
            Type.SIMPLE -> {
                "$baseVarName = ${
                    convertSimple(
                        targetMember,
                        sourceMember,
                        sourceVarName,
                    )
                },\n"
            }

            Type.COLLECTION -> {
                "${getFullNameForTarget(targetMember, targetMember.name, sourceMember)} = ${
                    convertToCollection(
                        targetMember,
                        sourceMember,
                        sourceVarName,
                        dataMethod,
                        resolver
                    )
                },\n"
            }

            Type.BYTE_ARRAY -> "${getFullNameForTarget(targetMember, targetMember.name, sourceMember)} = ${
                convertByteArray(
                    targetMember,
                    sourceMember,
                    sourceVarName
                )
            },\n"

            Type.MAP_ENTRY -> "$baseVarName = ${
                convertToMap(
                    targetMember,
                    sourceMember,
                    sourceVarName,
                    dataMethod,
                    resolver
                )
            },\n"

            Type.MAP -> "$baseVarName = ${
                convertToMap(
                    targetMember,
                    sourceMember,
                    sourceVarName,
                    dataMethod,
                    resolver
                )
            },\n"

            Type.ENUM, Type.DATA, Type.ONE_OF -> {
                val isNullSafe = type == Type.ENUM
                "$baseVarName = ${
                    dataMethod.getDataCall(
                        sourceVarName,
                        isNullSafe,
                        noFallback = !isNullSafe
                    )
                },\n"
            }
        }
    }
}
