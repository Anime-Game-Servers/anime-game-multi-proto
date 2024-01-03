package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface MathQuaternion {
    var x: Float
    var y: Float
    var z: Float
    var w: Float
}