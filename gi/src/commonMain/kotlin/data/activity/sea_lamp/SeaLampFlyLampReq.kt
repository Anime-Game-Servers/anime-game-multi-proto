package data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampFlyLampReq {
    var itemId: Int
    @RemovedIn(Version.GI_1_3_0)
    var wishText: String
    @AddedIn(Version.GI_0_9_0)
    var itemNum: Int
    @AddedIn(Version.GI_1_0_0) @RemovedIn(Version.GI_1_3_0)
    var activityId: Int
    @AddedIn(Version.GI_1_3_0)
    var pos: Vector
    @AddedIn(Version.GI_1_3_0)
    var param: Int
}