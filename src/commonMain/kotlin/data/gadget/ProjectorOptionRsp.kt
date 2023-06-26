package data.gadget

import annotations.AddedIn
import data.general.vehicle.VehicleMember
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface ProjectorOptionRsp {
    var opType: Int // TODO use ProjectorOpType directly?
    var entityId: Int
    var retCode: Int
}