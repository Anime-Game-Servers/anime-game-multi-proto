package data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.RESPONSE)
interface SeaLampFlyLampRsp {
    @RemovedIn(Version.GI_1_0_0)
    var totalContribution: Int
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var remainFlyNum: Int
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var addContribution: Int
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var addProgress: Int
    @AddedIn(Version.GI_0_9_0)
    var itemNum: Int
    @AddedIn(Version.GI_1_0_0)
    var itemId: Int
    var retcode: Int
}