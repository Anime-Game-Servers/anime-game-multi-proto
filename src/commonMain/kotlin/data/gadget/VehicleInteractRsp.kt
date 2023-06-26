package data.gadget

import annotations.AddedIn
import data.general.vehicle.VehicleMember
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.RESPONSE)
interface VehicleInteractRsp {
    var entityId: Int
    var interactType: VehicleInteractType
    var member: VehicleMember
    var retCode: Int
}