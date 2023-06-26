package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface VehicleInteractReq {
    var entityId: Int
    var interactType: VehicleInteractType
    var pos: Int
}