package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_5_0)
@ProtoModel
interface Furniture {
    var count: Int
}