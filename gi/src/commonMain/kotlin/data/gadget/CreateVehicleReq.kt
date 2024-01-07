package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface CreateVehicleReq {
    var vehicleId: Int
    var scenePointId: Int
    var pos: Vector
    var rot: Vector
}