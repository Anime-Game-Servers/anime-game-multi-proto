import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.gi.messages.activity.general.ActivityInfo
import org.anime_game_servers.multi_proto.gi.messages.activity.summer_time_v2.SummerTimeV2BoatStageInfo

class test {
    fun test(){
        val tsetst = SummerTimeV2BoatStageInfo()
        tsetst.encodeToByteArray(Version.GI_3_2_0)
        val testActivityInfo = ActivityInfo()
        testActivityInfo.summerTimeInfo
    }
}