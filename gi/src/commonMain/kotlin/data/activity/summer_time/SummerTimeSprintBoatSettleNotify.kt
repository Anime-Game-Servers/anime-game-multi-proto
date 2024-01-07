package data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.NOTIFY)
interface SummerTimeSprintBoatSettleNotify {
    var isSuccess: Boolean
    var leftTime: Int
    var collectNum: Int
    var totalNum: Int
    var score: Int
    var isNewRecord: Boolean
    var medalLevel: Int
    var groupId: Int
}