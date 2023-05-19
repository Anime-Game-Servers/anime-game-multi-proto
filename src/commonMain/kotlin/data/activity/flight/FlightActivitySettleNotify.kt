package data.activity.flight

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FlightActivitySettleNotify {
    var isSuccess: Boolean
    var leftTime: Int
    var collectNum: Int
    var totalNum: Int
    var score: Int
    var isNewRecord: Boolean
    var medalLevel: Int
    var groupId: Int
}