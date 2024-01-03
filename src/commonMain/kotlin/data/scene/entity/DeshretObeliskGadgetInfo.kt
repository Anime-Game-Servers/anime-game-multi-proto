package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V3_0_0)
@ProtoModel
internal interface DeshretObeliskGadgetInfo {
    var argumentList: List<Int>
}
