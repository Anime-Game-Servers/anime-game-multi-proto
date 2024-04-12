package data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@RemovedIn(Version.GI_0_9_0)
@ProtoModel
interface SeaLampActivityPlayerInfo {
    var contribution: Int
}