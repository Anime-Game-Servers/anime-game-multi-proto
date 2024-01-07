package data.activity.flight

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_1_0)
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