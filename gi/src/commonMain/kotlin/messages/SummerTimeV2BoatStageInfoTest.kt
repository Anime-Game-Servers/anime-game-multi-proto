package messages

import data.BoolDefault
import data.IntDefault
import data.activity.summer_time_v2.SummerTimeV2BoatStageInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray

@AddedIn(Version.GI_2_8_0)
data class SummerTimeV2BoatStageInfoTest(
    override var openTime: Int = IntDefault,
    override var isOpen: Boolean = BoolDefault,
    override var stageId: Int = IntDefault,
    override var bestScore: Int = IntDefault
) : SummerTimeV2BoatStageInfo {


    companion object {
        fun parseBy(data:ByteArray,version: Version) : SummerTimeV2BoatStageInfoTest?{
            return when (version.namespace) {
                Version.GI_3_2_0.namespace -> parseV3_2(data)
                //VERSION.V3_3_0.namespace -> parseV3_3(data)
                else -> return SummerTimeV2BoatStageInfoTest()
            }
        }

        private fun parseV3_2(data:ByteArray) : SummerTimeV2BoatStageInfoTest{
            val parsed  =protos.V3_2.SummerTimeV2BoatStageInfo.decodeFromByteArray(data)
            return SummerTimeV2BoatStageInfoTest(parsed.openTime, parsed.isOpen, parsed.stageId, parsed.bestScore)
        }
        /*private fun parseV3_3(data:ByteArray) : SummerTimeV2BoatStageInfoTest{
            val parsed  =protos.V3_3.SummerTimeV2BoatStageInfo.decodeFromByteArray(data)

            val test =ActivityInfo()
            test.activityCoinMap.associateByTo(mutableMapOf(), {it.key},{it.value})
            return SummerTimeV2BoatStageInfoTest(parsed.openTime, parsed.isOpen, parsed.stageId, parsed.bestScore)
        }*/
    }

    fun encodeToByteArray(version: Version): ByteArray? {
        return when (version.namespace) {
            Version.GI_3_2_0.namespace -> protos.V3_2.SummerTimeV2BoatStageInfo(openTime, isOpen, stageId, bestScore).encodeToByteArray()
            //VERSION.V3_3_0.namespace -> protos.V3_3.SummerTimeV2BoatStageInfo(openTime, isOpen, stageId, bestScore).encodeToByteArray()
            else -> null
        }
    }
}
