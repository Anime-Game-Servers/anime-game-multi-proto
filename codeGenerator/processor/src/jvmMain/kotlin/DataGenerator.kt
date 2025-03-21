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
    override fun addImports(file: OutputStream, classInfo: ClassInfo) {
        super.addImports(file, classInfo)
        file += "import ${ProtoModel::class.java.canonicalName}\n" +
                "import ${ProtoModelDecoder::class.java.canonicalName}\n" +
                "import pbandk.decodeFromByteArray\n"+
                "import pbandk.encodeToByteArray\n"+
                "import $PROTO_ONE_OF_ANNOTATION\n"
    }

    override fun addConstructor(file: OutputStream, classInfo:ClassInfo){
        super.addConstructor(file, classInfo)
        // data class can not be empty, so we use an empty normal class instead
        if(classInfo.modelMembers.isEmpty()){
            file += "class ${classInfo.name} : ${getImplementedModels(classInfo)} {\n"
            return
        }
        file += "data class ${classInfo.name} @JvmOverloads constructor (\n"
        classInfo.modelMembers.forEach {
            file.id(4) +="var `${it.value.name.getVariableName()}`: ${getTypeString(it)} = ${it.value.getDefaultValueForType(classInfo.oneOfs[it.key])},\n"
        }
        file += ") : ${getImplementedModels(classInfo)}{\n"
    }

    open fun getImplementedModels(classInfo:ClassInfo):String{
        return ProtoModel::class.java.simpleName
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        classInfo.oneOfs.values.forEach { oneOfData ->
            logger.info("OneOf: $oneOfData")
            val oneOfClasses = oneOfData.oneOfTypes.mapNotNull { classInfoCache[it] }
            // TODO OneOfEntry handling with name mapping
            val oneOfClassMap = oneOfData.oneOfClassMap.mapNotNull { classInfoCache[it.value]?.let { value -> it.key to value } }.toMap()

            //file.id(4) +="public sealed class ${it.wrapperName}<T: ProtoModel>(val value: T) : ProtoModel {\n"
            file.id(4) +="public sealed class ${oneOfData.wrapperName}<T>(val value: T) : ProtoModel {\n"
            file.id(8) +="public class ${oneOfData.unknownName}() : ${oneOfData.wrapperName}<UnknownModel>(UnknownModel())\n"
            file.id(8) +="public class UnknownModel() : ProtoModel{\n"
            file.id(12) +="override fun encodeToByteArray(version: $VERSION_ENUM_CLASS): ByteArray? = null\n"
            file.id(8) +="}\n"
            file.id(8) +="override fun encodeToByteArray(version: $VERSION_ENUM_CLASS): ByteArray? {\n"
            file.id(12) +="return when(value) {\n"
            file.id(16) += "is ProtoModel -> value.encodeToByteArray(version)\n"
            // todo maybe add support for some internal classes like String and Int?
            file.id(16) +="else -> null\n"
            file.id(12) +="}\n"
            file.id(8) +="}\n"
            oneOfClassMap.forEach { name, oneOfClass ->
                val className = if(oneOfData.allowTypeBasedMapping) oneOfClass.name else name.getClassName()
                file.id(8) +="public class ${className}(value:${oneOfClass.packageName}.${oneOfClass.name}) : ${oneOfData.wrapperName}<${oneOfClass.packageName}.${oneOfClass.name}>(value)\n"
            }
            classInfo.protoSet.forEach protoSetFor@{ protoData ->
                // check that the oneOf variable is actually part of the proto
                if(protoData.members.values.none { it.isPrimaryConstructorMember && it.name.equals(oneOfData.variableName, true) }) {
                    return@protoSetFor
                }


                val functionName = protoData.encodeFunctionName
                file.id(8) += "internal fun $functionName() : ${protoData.absoluteClassName}.${oneOfData.wrapperName}<*>? {\n"
                file.id(12) +="return when (this) {\n"
                oneOfClassMap.forEach { fieldName, oneOfClass ->
                    val className = if(oneOfData.allowTypeBasedMapping) oneOfClass.name else fieldName.getClassName()
                    protoData.members.forEach { member ->
                        if(member.value.type.starProjection().declaration.simpleName.asString().equals(oneOfClass.name, true) && compareIgnoreCase(member.key, fieldName)) {
                            val accessor = if(oneOfClass.isProtoModel) "value.${functionName}()" else "value"
                            file.id(16) += "is ${className} -> $accessor.let {\n"
                            file.id(20) += "${protoData.packageName}.${protoData.className}.${oneOfData.wrapperName}.${member.value.name.capitalizeFirstLetter()}(it)\n"
                            file.id(16) += "}\n"
                        }
                    }
                }
                file.id(16) +="else -> null\n"
                file.id(12) +="}\n"
                file.id(8)+="}\n"
            }
            file.id(8) += "public companion object {\n"
            classInfo.protoSet.forEach protoSetFor@{ protoData ->
                // check that the oneOf variable is actually part of the proto
                if(protoData.members.values.none { it.isPrimaryConstructorMember && it.name.equals(oneOfData.variableName, true) }) {
                    return@protoSetFor
                }

                val functionName = protoData.parseFunctionName
                file.id(12) += "internal fun $functionName(value: ${protoData.absoluteClassName}.${oneOfData.wrapperName}<*>) : ${oneOfData.wrapperName}<*>? {\n"
                file.id(16) +="return when (value) {\n"
                oneOfClassMap.forEach { fieldName, oneOfClass ->
                    protoData.members.forEach { member ->
                        val className = if(oneOfData.allowTypeBasedMapping) oneOfClass.name else fieldName.getClassName()
                        if(member.value.type.starProjection().declaration.simpleName.asString().equals(oneOfClass.name, true) &&
                            compareIgnoreCase(member.key, fieldName)) {
                            val accessor = if(oneOfClass.isProtoModel) "${oneOfClass.packageName}.${oneOfClass.name}.${protoData.parseFunctionName}(value.value)" else "value.value"
                            file.id(20) += "is ${protoData.packageName}.${protoData.className}.${oneOfData.wrapperName}.${member.value.name.capitalizeFirstLetter()} -> \n"
                            //file.id(24) += "${className}(${oneOfClass.packageName}.${oneOfClass.name}.${protoData.parseFunctionName}(value.value))\n"
                            file.id(24) += "${className}($accessor)\n"
                        }
                    }
                }
                file.id(20) +="else -> ${oneOfData.unknownName}()\n"
                file.id(16) +="}\n"
                file.id(12)+="}\n"
            }
            file.id(8) += "}\n"

            file.id(4) +="}\n"
        }
    }

    override fun addEncodeMethods(file: OutputStream, classInfo: ClassInfo) {
        file.id(4) +="override fun encodeToByteArray(version:$VERSION_ENUM_CLASS_NAME) : ByteArray? {\n"
        file.id(8) +="return when (version.namespace) {\n"
        classInfo.protoSet.forEach { proto ->
            file.id(12) +="\"${proto.versionPackage}\" -> " + "${proto.encodeFunctionName}().encodeToByteArray()\n"
        }
        file.id(12) +="else -> null\n"
        file.id(8) +="}\n"
        file.id(4) +="}\n"

        classInfo.protoSet.forEach { proto ->
            val functionName = proto.encodeFunctionName
            val protoClass = proto.absoluteClassName
            val protoMembers = proto.members

            file.id(4) +="internal fun $functionName() : $protoClass {\n"
            file.id(8) +="return $protoClass(\n"
            addConstructorMembers(
                12,
                classInfo.modelMembers,
                protoMembers,
                file,
                dataMethod = DataMethodInfo(functionName, true)
            )
            file.id(8) +=")\n"
            file.id(4) +="}\n"
        }
    }

    override fun addParsingMethods(file: OutputStream, classInfo: ClassInfo) {
        file.id(8) +="@JvmStatic\n"
        file.id(8) +="fun parseBy(data: ByteArray, version:$VERSION_ENUM_CLASS_NAME): ${classInfo.name} {\n"
        file.id(12) +="return when(version.namespace) {\n"
        classInfo.protoSet.forEach { proto ->
            file.id(16) +="\"${proto.versionPackage}\" -> {\n"
            file.id(20) +="return ${proto.parseFunctionName}(data)\n"
            file.id(16) +="}\n"
        }
        file.id(16) +="else -> ${classInfo.name}()\n"
        file.id(12) +="}\n"
        file.id(8) +="}\n"
        classInfo.protoSet.forEach { proto ->
            val functionName = proto.parseFunctionName
            val protoClass = proto.absoluteClassName
            val protoMembers = proto.members
            file.id(8) += "internal fun $functionName(data:ByteArray) : ${classInfo.name} {\n"
            file.id(12) +="return $functionName($protoClass.decodeFromByteArray(data))\n"
            file.id(8) +="}\n"

            file.id(8) +="internal fun $functionName(proto:$protoClass) : ${classInfo.name} {\n"
            file.id(12) +="return ${classInfo.name}(\n"
            addConstructorMembers(
                16,
                protoMembers,
                classInfo.modelMembers,
                file,
                "proto",
                DataMethodInfo(functionName, false, "data/messages" )
            )
            file.id(12) += ")\n"
            file.id(8) +="}\n"
            file.id(8) +="\n"
        }
        file.id(4) +="}\n"
    }
}
