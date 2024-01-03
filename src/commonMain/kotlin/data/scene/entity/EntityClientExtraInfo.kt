package data.scene.entity

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V2_7_0)
@ProtoModel
internal interface EntityClientExtraInfo {
    var skillAnchorPosition: Vector
}
