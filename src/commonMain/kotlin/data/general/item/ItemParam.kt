package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface ItemParam {
    var itemId: Int
    var count: Int
}