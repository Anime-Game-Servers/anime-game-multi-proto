package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_8_0)
@ProtoModel
internal interface NightCrowGadgetInfo {
    var argumentList: List<Int>
}
