import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.multi_proto.core.interfaces.PacketIdProvider
import java.io.OutputStream
import java.util.*

class PacketIdGenerator(
    val logger: KSPLogger
) {
    fun createClassForProto(file: OutputStream, className: String, packetIdMap: PacketIdResult) {
        file += "package packet_id\n"
        addImports(file)
        addBody(file, className, packetIdMap)
        file.close()
    }

    fun addImports(file: OutputStream) {
        file += "import ${PacketIdProvider::class.java.canonicalName}\n"
    }

    fun addBody(file: OutputStream, className: String, packetIdMap: PacketIdResult) {
        file += "class $className : PacketIdProvider {\n"
        generatePacketNameFun(file, packetIdMap.nameIdMap)
        generatePacketIdFun(file, packetIdMap.idNameMap)
        file += "}\n"
    }

    fun generatePacketNameFun(file: OutputStream, packetIdMap: Map<String, Int>) {
        file.id(4) += ("override fun getPacketId(packetName:String) = when(packetName) {\n")
        packetIdMap.forEach { (packetName, packetId) ->
            file.id(8) += ("\"$packetName\" ->  $packetId\n")
        }
        file.id(8) += ("else -> 999999\n")
        file.id(4) += ("}\n")
    }


    fun generatePacketIdFun(file: OutputStream, packetIdMap: Map<Int, String>) {
        file.id(4) += ("override fun getPacketName(packetId:Int) = when(packetId) {\n")
        packetIdMap.forEach { (packetId, packetName) ->
            file.id(8) += ("$packetId -> \"$packetName\"\n")
        }
        file.id(8) += ("else -> null\n")
        file.id(4) += ("}\n")
    }


    fun createClassForVersionMapper(file: OutputStream, versions: Collection<String>) {
        file += "package packet_id\n"
        addVersionMapperImports(file)
        addVersionMapperBody(file, versions)
        file.close()
    }

    fun addVersionMapperImports(file: OutputStream) {
        file += "import kotlin.jvm.JvmStatic\n"
        file += "import $VERSION_ENUM_CLASS\n\n"
    }

    fun addVersionMapperBody(file: OutputStream, versions: Collection<String>) {
        file += "object PacketIds {\n"
        generateVersionPacketMapperFun(file, versions)
        file += "}\n"
    }

    fun generateVersionPacketMapperFun(file: OutputStream, versions: Collection<String>) {
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

    data class PacketIdResult(val dependencies: Set<KSFile>,
                              val nameIdMap : Map<String, Int>,
                              val idNameMap : Map<Int, String>
    )
}