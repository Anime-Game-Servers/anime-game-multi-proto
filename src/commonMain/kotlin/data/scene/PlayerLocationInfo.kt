package data.scene

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB1

@AddedIn(VCB1)
@ProtoModel
internal interface PlayerLocationInfo {
    var uid: Int
    var pos: Vector
    var rot: Vector
}
