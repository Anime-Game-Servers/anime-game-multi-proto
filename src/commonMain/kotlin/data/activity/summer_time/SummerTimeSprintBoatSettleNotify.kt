package data.activity.summer_time

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
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