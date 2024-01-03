package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V3_0_0)
@ProtoModel
interface FishtankFishInfo {
    var fishDistanceFromWater: Float
    var fishScale: Float
    var initialRotationY: Float
}