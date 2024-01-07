import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.getKotlinClassByName
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.*
import java.io.OutputStream
import java.util.*

class PackageIdGenerator(
    val logger: KSPLogger
) {
    fun createClassForProto(file: OutputStream, className: String, packageIdMap: PackageIdResult) {
        file += "package package_id\n"
        addImports(file)
        addBody(file, className, packageIdMap)
        file.close()
    }

    fun addImports(file: OutputStream) {
        file += "import interfaces.PackageIdProvider\n"
    }

    fun addBody(file: OutputStream, className: String, packageIdMap: PackageIdResult) {
        file += "class $className : PackageIdProvider {\n"
        generatePackageNameFun(file, packageIdMap.nameIdMap)
        generatePackageIdFun(file, packageIdMap.idNameMap)
        file += "}\n"
    }

    fun generatePackageNameFun(file: OutputStream, packageIdMap: Map<String, Int>) {
        file.id(4) += ("override fun getPackageId(packageName:String) = when(packageName) {\n")
        packageIdMap.forEach { (packageName, packageId) ->
            file.id(8) += ("\"$packageName\" ->  $packageId\n")
        }
        file.id(8) += ("else -> 999999\n")
        file.id(4) += ("}\n")
    }


    fun generatePackageIdFun(file: OutputStream, packageIdMap: Map<Int, String>) {
        file.id(4) += ("override fun getPackageName(packageId:Int) = when(packageId) {\n")
        packageIdMap.forEach { (packageId, packageName) ->
            file.id(8) += ("$packageId -> \"$packageName\"\n")
        }
        file.id(8) += ("else -> null\n")
        file.id(4) += ("}\n")
    }


    fun createClassForVersionMapper(file: OutputStream, versions: Collection<String>) {
        file += "package package_id\n"
        addVersionMapperImports(file)
        addVersionMapperBody(file, versions)
        file.close()
    }

    fun addVersionMapperImports(file: OutputStream) {
        file += "import kotlin.jvm.JvmStatic\n"
        file += "import $VERSION_ENUM_CLASS\n\n"
    }

    fun addVersionMapperBody(file: OutputStream, versions: Collection<String>) {
        file += "object PackageIds {\n"
        generateVersionPackageMapperFun(file, versions)
        file += "}\n"
    }

    fun generateVersionPackageMapperFun(file: OutputStream, versions: Collection<String>) {
        file.id(4) += ("@JvmStatic\n")
        file.id(4) += ("fun getMapper(version:$VERSION_ENUM_CLASS_NAME) = when(version) {\n")
        versions.forEach { version ->
            file.id(8) += ("$VERSION_ENUM_CLASS_NAME.$version ->  $version()\n")
        }
        file.id(8) += ("else -> null\n")
        file.id(4) += ("}\n")
    }


    fun KSType.getFullClassName(): String {
        return declaration.getFullClassName()
    }

    fun KSDeclaration.getFullClassName(): String {
        parentDeclaration?.let {
            return it.getFullClassName() + "." + simpleName.asString()
        }
        return packageName.asString() + "." + simpleName.asString()
    }

    operator fun OutputStream.plusAssign(str: String) {
        this.write(str.toByteArray())
    }

    protected fun OutputStream.id(indentation: Int): OutputStream {
        this += " ".repeat(indentation)
        return this
    }

    companion object {

        fun String.capitalizeFirstLetter(): String {
            return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    }

    data class PackageIdResult(val dependencies: Set<KSFile>,
                               val nameIdMap : Map<String, Int>,
                               val idNameMap : Map<Int, String>
    )
}