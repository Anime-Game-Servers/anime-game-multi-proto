import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.*
import org.anime_game_servers.multi_proto.core.interfaces.PacketIdProvider
import java.io.OutputStream
import java.util.*
import kotlin.collections.List

class PacketIdGenerator(
    val logger: KSPLogger,
    val basePacket: String
) {
    fun createClassForProto(file: OutputStream, className: String, packetIdMap: PacketIdResult) {
        file += "package ${basePacket}.packet_id\n"
        addImports(file)
        addBody(file, className, packetIdMap)
        file.close()
    }

    fun addImports(file: OutputStream) {
        file += "import ${PacketIdProvider::class.java.canonicalName}\n"
    }

    fun addBody(file: OutputStream, className: String, packetIdMap: PacketIdResult) {
        file += "class $className : PacketIdProvider {\n"
        generatePacketNameMainFun(file, packetIdMap.nameIdMap)
        generatePacketIdFun(file, packetIdMap.idNameMap)
        file += "}\n"
    }

    private fun generatePacketNameMainFun(file: OutputStream, packetIdMap: Map<String, Int>) {
        val characterMap : MutableMap<Char, MutableList<Pair<String, Int>>> = mutableMapOf()
        val characters = packetIdMap.entries.map {
            val char = it.key.first()
            val list = characterMap.computeIfAbsent(char) { mutableListOf() }
            list.add(it.toPair())
            return@map char
        }.distinct()
        file.id(4) += ("override fun getPacketId(packetName:String) : Int { \n")
        file.id(4) += ("val firstChar = packetName.firstOrNull() \n")
        file.id(8) += ("return when(firstChar) {\n")
        characters.forEach { character ->
            file.id(12) += ("'$character' ->  getPacketId${character}(packetName)\n")
        }
        file.id(12) += ("else -> 999999\n")
        file.id(8) += ("}\n")
        file.id(4) += ("}\n")
        characters.forEach { character ->
            generatePacketNameFunForChar(file, character, characterMap[character]!!)
        }
    }
    private fun generatePacketNameFunForChar(file: OutputStream, startChar: Char, packetIdMap: List<Pair<String, Int>>) {
        file.id(4) += ("private fun getPacketId$startChar(packetName:String) = when(packetName) {\n")
        packetIdMap.forEach { (packetName, packetId) ->
            file.id(8) += ("\"$packetName\" ->  $packetId\n")
        }
        file.id(8) += ("else -> 999999\n")
        file.id(4) += ("}\n")
    }


    private fun generatePacketIdFun(file: OutputStream, packetIdMap: Map<Int, String>) {
        val idGroupMap = packetIdMap.entries.map { it.toPair() }.groupBy { it.first / 1000 }
        val idGroups = idGroupMap.keys.sorted()
        file.id(4) += ("override fun getPacketName(packetId: Int) : String? {\n")
        file.id(4) += ("val packetIdGroup = packetId/1000 \n")
        file.id(8) += ("return when(packetIdGroup) {\n")
        idGroups.forEach { groupId ->
            file.id(12) += ("$groupId -> getPacketName$groupId(packetId)\n")
        }
        file.id(12) += ("else -> null\n")
        file.id(8) += ("}\n")
        file.id(4) += ("}\n")
        idGroups.forEach { groupId ->
            generatePacketIdFun(file, groupId, idGroupMap[groupId]!!.sortedBy { it.first })
        }
    }

    private fun generatePacketIdFun(file: OutputStream, group: Int, packetIdMap: List<Pair<Int, String>>) {
        file.id(4) += ("private fun getPacketName$group(packetId: Int) = when(packetId) {\n")
        packetIdMap.forEach { (packetId, packetName) ->
            file.id(8) += ("$packetId -> \"$packetName\"\n")
        }
        file.id(8) += ("else -> null\n")
        file.id(4) += ("}\n")
    }


    fun createClassForVersionMapper(file: OutputStream, versions: Collection<String>) {
        file += "package ${basePacket}.packet_id\n"
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