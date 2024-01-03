package messages

import org.anime_game_servers.annotations.ProtoVersionEnum
import kotlin.jvm.JvmStatic

const val GI_CB1 = 700
const val GI_CB2 = 800
const val GI_0_9_0 = 900
const val GI_1_0_0 = 1000
const val GI_1_1_0 = 1100
const val GI_1_2_0 = 1200
const val GI_1_3_0 = 1300
const val GI_1_4_0 = 1400
const val GI_1_5_0 = 1500
const val GI_1_6_0 = 1600
const val GI_2_0_0 = 2000
const val GI_2_1_0 = 2100
const val GI_2_2_0 = 2200
const val GI_2_3_0 = 2300
const val GI_2_4_0 = 2400
const val GI_2_5_0 = 2500
const val GI_2_6_0 = 2600
const val GI_2_7_0 = 2700
const val GI_2_8_0 = 2800
const val GI_3_0_0 = 3000
const val GI_3_1_0 = 3100
const val GI_3_2_0 = 3200
const val GI_3_3_0 = 3300
const val GI_3_4_0 = 3400
const val GI_3_5_0 = 3500
const val GI_3_6_0 = 3600
const val GI_3_7_0 = 3700
const val GI_3_8_0 = 3800
const val GI_4_0_0 = 4000
const val GI_4_1_0 = 4100
const val GI_4_2_0 = 4200
const val GI_4_3_0 = 4300
@ProtoVersionEnum
enum class VERSION(val id:Int, val namespace:String) {
    VCB1(700,"VCB1"),
    VCB2(800,"VCB2"),
    V0_9_0(900,"V0_9"),
    V1_0_0(1000,"V1_0"),
    V1_1_0(1100,"V1_1"),
    V1_2_0(1200,"V1_2"),
    V1_3_0(1300,"V1_3"),
    V1_4_0(1400,"V1_4"),
    V1_5_0(1500,"V1_5"),
    V1_6_0(1600,"V1_6"),
    V2_0_0(2000,"V2_0"),
    V2_1_0(2100,"V2_1"),
    V2_2_0(2200,"V2_2"),
    V2_3_0(2300,"V2_3"),
    V2_4_0(2400,"V2_4"),
    V2_5_0(2500,"V2_5"),
    V2_6_0(2600,"V2_6"),
    V2_7_0(2700, "V2.7"),
    V2_8_0(2800, "V2_8"),
    V3_0_0(3000, "V3_0"),
    V3_1_0(3100, "V3_2"),
    V3_2_0(3200, "V3_2"),
    V3_3_0(3300, "V3_3"),
    V3_4_0(3400, "V3_4"),
    V3_5_0(3500, "V3_5"),
    V3_6_0(3600, "V3_6"),
    V3_7_0(3700, "V3_7"),
    V3_8_0(3800, "V3_8"),
    V4_0_0(4000, "V4_0"),
    V4_0_1(4001, "V4_0"),
    V4_1_0(4100, "V4_1"),
    V4_2_0(4200, "V4_2"),;
    companion object {
        @JvmStatic
        fun fromId(id:Int):VERSION?{
            return entries.firstOrNull { it.id == id }
        }

        @JvmStatic
        fun fromVersion(major: Int, minor: Int, fix:Int):VERSION?{
            val versionId = idFromVersion(major, minor, fix)
            return entries.firstOrNull { it.id == versionId }
        }

        @JvmStatic
        fun idFromVersion(major: Int, minor: Int, fix:Int):Int{
            return major*1000 + minor*100 +fix;
        }
    }
}
