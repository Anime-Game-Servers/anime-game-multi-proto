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

    private fun getProtoData(classInfo: ClassInfo): ProtoData? {
        return classInfo.protoSet.firstOrNull()
    }

    override fun getModelClass(classInfo: ClassInfo): String {
        return "EnumModel"
    }

    override fun addImports(file: OutputStream, classInfo: ClassInfo) {
        super.addImports(file, classInfo)
        file += "import ${super.getModelClass(classInfo)} as ${this.getModelClass(classInfo)}\n"
        getProtoData(classInfo)?.let { proto ->
            file += "import ${proto.absoluteClassName} as Proto\n"
        }
    }

    override fun addConstructor(file: OutputStream, classInfo: ClassInfo) {
        val modelClass = getModelClass(classInfo)
        file += "abstract class ${classInfo.name}: VersionedEnumHandler<${modelClass}> {\n"
    }

    private fun KSClassDeclaration.getEnumNames(): List<String> {
        val names = mutableListOf(simpleName.asString())
        annotations.filter { annotation -> annotation.shortName.asString() == "AltName" }
            .forEach { it.arguments.forEach { (it.value as? List<String>)?.let { names.addAll(it) } } }

        return names
    }

    override fun addCompanionObject(file: OutputStream, classInfo: ClassInfo) {
        val modelClass = getModelClass(classInfo)
        file.id(4) += "companion object: VersionedEnumHandler<$modelClass> {\n"
        if (getProtoData(classInfo) == null) {
            unimplementedCompanion(file, classInfo)
        }
        else {
            implementCompanion(file, classInfo)
        }
        file.id(4) += "}\n"
    }

    private fun implementCompanion(file: OutputStream, classInfo: ClassInfo) {
        val modelClass = getModelClass(classInfo)
        val protoClass = "Proto"
        file.id(8) += "@JvmStatic\n"
        file.id(8) += "override fun encodeValue(model: $modelClass): Int {\n"
        file.id(12) += "return convertModelToProto(model).value\n"
        file.id(8) += "}\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "override fun decodeValue(value: Int): $modelClass {\n"
        file.id(12) += "val proto = $protoClass.fromValue(value)\n"
        file.id(12) += "return convertProtoToModel(proto)\n"
        file.id(8) += "}\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "internal fun convertModelToProto(model: $modelClass) = (\n"
        file.id(12) += "$protoClass.values.find { model.names.contains(it.name) } ?: $protoClass.fromValue(0)\n"
        file.id(8) += ")\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "internal fun convertProtoToModel(proto: $protoClass) = (\n"
        file.id(12) += "when(proto.name) {\n"
        classInfo.declarations.forEach enumDeclaration@{ enumDeclaration ->
            val names = enumDeclaration.getEnumNames()
            if (names.isEmpty()) return@enumDeclaration
            file.id(16) += names.joinToString(", ") { "\"$it\"" } +
                    " -> $modelClass.${enumDeclaration.simpleName.asString()}\n"
        }
        file.id(16) += "else -> $modelClass.UNRECOGNISED\n"
        file.id(12) += "}\n"
        file.id(8) += ")\n"
    }

    private fun unimplementedCompanion(file: OutputStream, classInfo: ClassInfo) {
        val unimplemented = "throw NotImplementedError(\"The proto class is not available\")"
        val modelClass = getModelClass(classInfo)
        val protoClass = "Any"
        file.id(8) += "@JvmStatic\n"
        file.id(8) += "override fun encodeValue(model: $modelClass): Int {\n"
        file.id(12) += "$unimplemented\n"
        file.id(8) += "}\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "override fun decodeValue(value: Int) = (\n"
        file.id(12) += "$modelClass.UNRECOGNISED\n"
        file.id(8) += ")\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "fun convertModelToProto(model: $modelClass): $protoClass {\n"
        file.id(12) += "$unimplemented\n"
        file.id(8) += "}\n"

        file.id(8) += "@JvmStatic\n"
        file.id(8) += "fun convertProtoToModel(proto: $protoClass) = (\n"
        file.id(12) += "$modelClass.UNRECOGNISED\n"
        file.id(8) += ")\n"
    }

    override fun addClosure(file: OutputStream, classInfo: ClassInfo) {
        file += "}"
    }
}