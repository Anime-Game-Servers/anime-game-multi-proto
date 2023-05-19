import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSType
import java.io.OutputStream
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
        file += "data class ${classInfo.name} @JvmOverloads constructor (\n"
        classInfo.modelMembers.forEach {
            file.id(4) +="var ${it.key}: ${getTypeString(it)} = ${it.value.getDefaultValueForType()},\n"
        }
        file += ") : ProtoModel{\n"
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        classInfo.oneOfs.values.forEach {
            val oneOfClasses = mutableSetOf<KClass<*>>()
            it.type.annotations.forEach { ksAnnotation ->
                if(ksAnnotation.shortName.asString() == "OneOf"){
                    ksAnnotation.arguments.forEach { ksArgument ->
                        val type = ksArgument.value as KClass<*>
                        oneOfClasses.add(type)
                    }
                }
            }

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