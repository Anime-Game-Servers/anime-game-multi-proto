package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_2_0_0)
@ProtoCommand(CommandType.REQUEST)
interface ProjectorOptionReq {
    var opType: Int // TODO use ProjectorOpType directly?
    var entityId: Int
}