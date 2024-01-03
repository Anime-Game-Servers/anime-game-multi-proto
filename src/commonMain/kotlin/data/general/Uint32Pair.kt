package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel
import org.anime_game_servers.core.gi.models.Vector

@AddedIn(VERSION.V1_3_0)
@ProtoModel
interface Uint32Pair {
    var key: Int
    var value: Int
}