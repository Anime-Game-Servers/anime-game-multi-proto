import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSType
import java.io.OutputStream

class EnumGenerator(
    logger: KSPLogger,
    resolver: Resolver,
    classInfoCache: MutableMap<KSType, ClassInfo>
) : BaseGenerator(logger, resolver, classInfoCache) {
    override fun addConstructor(file: OutputStream, classInfo: ClassInfo) {
        super.addConstructor(file, classInfo)
        file += "enum class ${classInfo.name}(\n"
        file.id(4) += "var names: Set<String>,\n"
        classInfo.modelMembers.filter { it.value.isPrimaryConstructorMember }.forEach {
            // TODO: rename the constructor member if its name is "names"
            file.id(4) += "var ${it.key}: ${getTypeString(it)} = ${it.value.getDefaultValueForType()},\n"
        }
        file += "){\n"
    }

    override fun addBody(file: OutputStream, classInfo: ClassInfo) {
        classInfo.declarations.forEach {
            file.id(4) += "${it.simpleName.asString()}(setOf(${it.getEnumNames().joinToString(", ") { "\"$it\"" }})),\n"
        }
        file.id(4) += "$UNRECOGNISED_ENUM_NAME(emptySet());\n"
    }

    override fun addEncodeMethods(file: OutputStream, classInfo: ClassInfo) {
        //TODO add AltName handling
        file.id(4) += "fun encodeToByteArray(version:$VERSION_ENUM_CLASS_NAME) : Int? {\n"
        file.id(8) += "return ProtoVersionManager.encodeValue(\n"
        file.id(12) += "version.namespace,\n"
        file.id(12) += "PROTO_CLASS_NAME,\n"
        file.id(12) += "this,\n"
        file.id(8) += ")\n"
        file.id(4) += "}\n"
    }

    private fun KSClassDeclaration.getEnumNames(): List<String> {
        val names = mutableListOf(simpleName.asString())
        annotations.filter { annotation -> annotation.shortName.asString() == "AltName" }
            .forEach { it.arguments.forEach { (it.value as? List<String>)?.let { names.addAll(it) } } }

        return names
    }

    override fun addCompanionObject(file: OutputStream, classInfo: ClassInfo) {
        val protoClass = "${classInfo.originalPackage.replaceFirst(".gi.data.", ".proto.")}.${classInfo.name}"
        file.id(4) += "companion object {\n"
        file.id(8) += "private const val PROTO_CLASS_NAME = \"$protoClass\"\n"
        file.id(8) += "@JvmStatic\n"
        file.id(8) += "fun decodeFromByteArray(value: Int, version:$VERSION_ENUM_CLASS_NAME): ${classInfo.name} {\n"
        file.id(12) += "val obj: ${classInfo.name}? = ProtoVersionManager.decodeValue(\n"
        file.id(16) += "version.namespace,\n"
        file.id(16) += "PROTO_CLASS_NAME,\n"
        file.id(16) += "value,\n"
        file.id(12) += ")\n"
        file.id(12) += "return obj ?: UNRECOGNISED\n"
        file.id(8) += "}\n"
        file.id(4) += "}\n"
    }

    override fun addClosure(file: OutputStream, classInfo: ClassInfo) {
        file += "}"
    }
}