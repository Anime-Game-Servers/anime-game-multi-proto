package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface GatherGadgetInfo {
    var itemId: Int
    var isForbidGuest: Boolean
}
