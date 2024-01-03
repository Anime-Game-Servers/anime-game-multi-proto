package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_2_0)
@ProtoModel
internal interface EntityEnvironmentInfo {
    var jsonClimateType: Int
    var climateAreaId: Int
}
