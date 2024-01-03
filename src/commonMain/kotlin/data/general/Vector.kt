package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel
import org.anime_game_servers.core.gi.models.Vector

@AddedIn(VERSION.VCB1)
@ProtoModel
interface Vector {
    var x: Float
    var y: Float
    var z: Float
}