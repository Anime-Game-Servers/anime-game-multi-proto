package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_2_0)
@ProtoModel
internal interface RoguelikeGadgetInfo {
    var cellConfigId: Int
    var cellType: Int
    var cellState: Int
    var cellId: Int
}
