package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_6_0)
@ProtoModel
internal interface CurVehicleInfo {
    var entityId: Int
    var pos: Int
}
