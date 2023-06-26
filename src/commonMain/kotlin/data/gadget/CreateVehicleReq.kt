package data.gadget

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface CreateVehicleReq {
    var vehicleId: Int
    var scenePointId: Int
    var pos: Vector
    var rot: Vector
}