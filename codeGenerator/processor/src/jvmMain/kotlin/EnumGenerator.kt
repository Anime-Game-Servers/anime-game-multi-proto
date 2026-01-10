import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import org.anime_game_servers.core.base.annotations.proto.AltName
import java.io.OutputStream
import kotlin.collections.addAll
import kotlin.sequences.forEach

const val UNRECOGNISED_ENUM_NAME = "UNRECOGNISED"

class EnumGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>
) : BaseGenerator(logger, resolver, classInfoCache) {
    override fun addConstructor(file: OutputStream, classInfo:ClassInfo){
        super.addConstructor(file, classInfo)
        file += "enum class ${classInfo.name}(\n"
        file.id(4) +="var names: Set<String>,\n"
        classInfo.modelMembers.forEach {
            file.id(4) +="var ${it.key}: ${getTypeString(it)} = ${it.value.getDefaultValueForType()},\n"
        }
        file += "){\n"
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        classInfo.declarations.forEach {
            file.id(4) +="${it.simpleName.asString()}(setOf(${it.getEnumNames().joinToString(", ") { "\"$it\"" }})),\n"
            //file.id(4) +="${it.simpleName.asString()},\n"
        }
        file.id(4) +="$UNRECOGNISED_ENUM_NAME(emptySet());\n"
    }

    override fun addEncodeMethods(file: OutputStream, classInfo: ClassInfo) {
        //TODO add AltName handling
        file.id(4) +="fun encodeToByteArray(version:$VERSION_ENUM_CLASS_NAME) : Int? {\n"
        file.id(8) +="return when (version.namespace) {\n"
        classInfo.protoSet.forEach { proto ->
            file.id(12) +="\"${proto.versionPackage}\" -> " + "${proto.encodeFunctionName}().value\n"
        }
        file.id(12) +="else -> null\n"
        file.id(8) +="}\n"
        file.id(4) +="}\n"

        classInfo.protoSet.forEach { proto ->
            val functionName = proto.encodeFunctionName
            val protoClass = proto.absoluteClassName

            file.id(4) +="internal fun $functionName() : $protoClass {\n"
            //file.id(8) +="return $protoClass.fromName(name)\n"
            file.id(8) +="return $protoClass.values.find { names.contains(it.name) }  ?: $protoClass.fromValue(0)\n"
            file.id(4) +="}\n"
        }
    }

    @OptIn(KspExperimental::class)
    private fun KSClassDeclaration.getEnumNames(): List<String> {
        val names = mutableListOf(simpleName.asString())

        getAnnotationsByType(AltName::class).forEach { altname ->
            names.addAll(altname.altNames)
        }

        return names
    }

    override fun addParsingMethods(file: OutputStream, classInfo: ClassInfo) {
        file.id(8) +="@JvmStatic\n"
        file.id(8) +="fun parseBy(value: Int, version:$VERSION_ENUM_CLASS_NAME): ${classInfo.name} {\n"
        file.id(12) +="return when(version.namespace) {\n"
        classInfo.protoSet.forEach { proto ->
            file.id(16) +="\"${proto.versionPackage}\" -> {\n"
            file.id(20) +="return ${proto.parseFunctionName}(value)\n"
            file.id(16) +="}\n"
        }
        file.id(16) +="else -> $UNRECOGNISED_ENUM_NAME\n"
        file.id(12) +="}\n"
        file.id(8) +="}\n"
        classInfo.protoSet.forEach { proto ->
            val functionName = proto.parseFunctionName
            val protoClass = proto.absoluteClassName
            val protoMembers = proto.members
            file.id(8) += "internal fun $functionName(value:Int) : ${classInfo.name} {\n"
            file.id(12) +="return $functionName($protoClass.fromValue(value))\n"
            file.id(8) +="}\n"

            file.id(8) +="internal fun $functionName(proto:$protoClass) : ${classInfo.name} {\n"
            //file.id(12) +="return proto.name?.let {\n"
            //file.id(16) +="${classInfo.name}.valueOf(it)\n"
            //file.id(12) += "} ?: $UNRECOGNISED_ENUM_NAME\n"
            file.id(12) +="return when(proto.name) {\n"
            classInfo.declarations.forEach enumDeclaration@{ enumDeclaration ->
                val names = enumDeclaration.getEnumNames()
                if(names.isEmpty()) return@enumDeclaration
                file.id(16) += names.joinToString(", ") { "\"$it\"" } +
                " -> ${enumDeclaration.simpleName.asString()}\n"
            }
            file.id(16) +="else -> UNRECOGNISED\n"
            file.id(12) +="}\n"
            file.id(8) +="}\n"
            file.id(8) +="\n"
        }
        file.id(4) +="}\n"
    }
}