package data.general.vehicle

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_6_0)
@ProtoModel
interface VehicleMember {
    var uid: Int
    var avatarGuid: Long
    var pos: Int
}