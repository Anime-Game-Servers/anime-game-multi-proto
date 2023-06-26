package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V2_0_0)
@ProtoCommand(CommandType.REQUEST)
interface ProjectorOptionReq {
    var opType: Int // TODO use ProjectorOpType directly?
    var entityId: Int
}