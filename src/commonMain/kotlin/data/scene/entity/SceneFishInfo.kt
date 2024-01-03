package data.scene.entity

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V2_1_0)
@ProtoModel
internal interface SceneFishInfo {
    var fishId: Int
    var fishPoolEntityId: Int
    var fishPoolPos: Vector
    var fishPoolGadgetId: Int
    @AddedIn(messages.VERSION.V2_4_0)
    var lastShockTime: Int
}
