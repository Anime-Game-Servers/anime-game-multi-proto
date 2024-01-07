package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_0_0)
@ProtoModel
interface FishtankFishInfo {
    var fishDistanceFromWater: Float
    var fishScale: Float
    var initialRotationY: Float
}