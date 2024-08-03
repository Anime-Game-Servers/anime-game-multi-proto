package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface HitCollision {
    var hitBoxIndex: Int
    var hitColliderType: HitColliderType
    var hitDir: Vector
    var hitPoint: Vector
    @AddedIn(GI_1_4_0)
    var attackeeHitEntityAngle: Float
    @AddedIn(GI_1_4_0)
    var attackeeHitForceAngle: Float
}
