package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface VehicleInteractReq {
    var entityId: Int
    var interactType: VehicleInteractType
    var pos: Int
}