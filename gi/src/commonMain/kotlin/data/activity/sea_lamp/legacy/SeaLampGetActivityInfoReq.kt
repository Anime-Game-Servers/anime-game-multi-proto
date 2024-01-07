package data.activity.sea_lamp.legacy

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampGetActivityInfoReq {
}