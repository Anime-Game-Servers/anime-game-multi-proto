package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V0_9_0)
@ProtoModel
internal interface EntityClientData {
    var windChangeSceneTime: Int
    var windmillSyncAngle: Float
    var windChangeTargetLevel: Int
}
