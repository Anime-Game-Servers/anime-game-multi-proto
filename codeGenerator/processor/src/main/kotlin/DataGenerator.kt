import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import org.anime_game_servers.annotations.OneOf
import java.io.OutputStream
import kotlin.math.log
import kotlin.reflect.KClass

open class DataGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>
) : BaseGenerator(logger, resolver, classInfoCache) {
    override fun addImports(file: OutputStream, classInfo: ClassInfo) {
        super.addImports(file, classInfo)
        file += "import interfaces.ProtoModel\n" +
                "import interfaces.ProtoModelDecoder\n" +
                "import pbandk.decodeFromByteArray\n"+
                "import pbandk.encodeToByteArray\n"+
                "import org.anime_game_servers.annotations.OneOf\n"
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
            file.id(4) +="var ${it.key}: ${getTypeString(it)} = ${it.value.getDefaultValueForType(classInfo.oneOfs[it.key])},\n"
        }
        file += ") : ${getImplementedModels(classInfo)}{\n"
    }

    open fun getImplementedModels(classInfo:ClassInfo):String{
        return "ProtoModel"
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        classInfo.oneOfs.values.forEach {
            val oneOfClasses = mutableSetOf<ClassInfo>()
            classInfo.definition.declarations.forEach declarations@{ declaration ->
                if(declaration.simpleName.asString()!= it.variableName) return@declarations
                declaration.annotations.forEach { ksAnnotation ->
                    if(ksAnnotation.shortName.asString() == "OneOf"){
                        ksAnnotation.arguments.forEach { ksArgument ->
                            logger.warn("Annotation: ${ksArgument.value}")
                            val type = ksArgument.value as? ArrayList<KSType>
                            type?.forEach { oneOfType ->
                                classInfoCache[oneOfType]?.let { oneOfClass ->
                                    oneOfClasses.add(oneOfClass)
                                }
                            }
                        }
                    }
                }
            }
            
            file.id(4) +="public sealed class ${it.wrapperName}<T: ProtoModel>(val value: T) : ProtoModel {\n"
            file.id(8) +="public class ${it.unknownName}() : ${it.wrapperName}<UnknownModel>(UnknownModel())\n"
            file.id(8) +="public class UnknownModel() : ProtoModel{\n"
            file.id(12) +="override fun encodeToByteArray(version: messages.VERSION): ByteArray? = null\n"
            file.id(8) +="}\n"
            file.id(8) +="override fun encodeToByteArray(version: messages.VERSION): ByteArray? {\n"
            file.id(12) +="return value.encodeToByteArray(version)\n"
            file.id(8) +="}\n"
            oneOfClasses.forEach { oneOfClass ->
                file.id(8) +="public class ${oneOfClass.name}(value:${oneOfClass.packageName}.${oneOfClass.name}) : ${it.wrapperName}<${oneOfClass.packageName}.${oneOfClass.name}>(value)\n"
            }
            classInfo.protoSet.forEach { protoData ->
                val functionName = protoData.encodeFunctionName
                file.id(8) += "internal fun $functionName() : ${protoData.absoluteClassName}.${it.wrapperName}<*>? {\n"
                file.id(12) +="return when (this) {\n"
                oneOfClasses.forEach { oneOfClass ->
                    protoData.members.forEach { member ->
                        if(member.value.starProjection().declaration.simpleName.asString() == oneOfClass.name) {
                            file.id(16) += "is ${oneOfClass.name} -> value.${protoData.encodeFunctionName}().let {\n"
                            file.id(20) += "${protoData.packageName}.${protoData.className}.${it.wrapperName}.${member.key.capitalizeFirstLetter()}(it)\n"
                            file.id(16) += "}\n"
                        }
                    }
                }
                file.id(16) +="else -> null\n"
                file.id(12) +="}\n"
                file.id(8)+="}\n"
            }
            file.id(8) += "public companion object {\n"
            classInfo.protoSet.forEach { protoData ->
                val functionName = protoData.parseFunctionName
                file.id(12) += "internal fun $functionName(value: ${protoData.absoluteClassName}.${it.wrapperName}<*>) : ${it.wrapperName}<*>? {\n"
                file.id(16) +="return when (value) {\n"
                oneOfClasses.forEach { oneOfClass ->
                    protoData.members.forEach { member ->
                        if(member.value.starProjection().declaration.simpleName.asString() == oneOfClass.name) {
                            file.id(20) += "is ${protoData.packageName}.${protoData.className}.${it.wrapperName}.${member.key.capitalizeFirstLetter()} -> \n"
                            file.id(24) += "${oneOfClass.name}(${oneOfClass.packageName}.${oneOfClass.name}.${protoData.parseFunctionName}(value.value))\n"
                        }
                    }
                }
                file.id(20) +="else -> ${it.unknownName}()\n"
                file.id(16) +="}\n"
                file.id(12)+="}\n"
            }
            file.id(8) += "}\n"

            file.id(4) +="}\n"
        }
    }

    override fun addEncodeMethods(file: OutputStream, classInfo: ClassInfo) {
        file.id(4) +="override fun encodeToByteArray(version:VERSION) : ByteArray? {\n"
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
        file.id(8) +="fun parseBy(data: ByteArray, version:VERSION): ${classInfo.name} {\n"
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