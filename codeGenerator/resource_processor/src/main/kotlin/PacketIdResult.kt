import com.google.devtools.ksp.symbol.*

data class PacketIdResult(val dependencies: Set<KSFile>,
                          val nameIdMap : Map<String, Int>,
                          val idNameMap : Map<Int, String>
)