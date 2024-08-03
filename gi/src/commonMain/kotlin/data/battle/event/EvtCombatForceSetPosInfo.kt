package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface EvtCombatForceSetPosInfo {
    var entityId: Int
    @RemovedIn(GI_1_1_0)
    var originPos: Vector
    var targetPos: Vector
    @RemovedIn(GI_1_1_0)
    var timestamp: Long
    @RemovedIn(GI_1_1_0)
    var velocity: Vector
    @AddedIn(GI_1_1_0)
    var colliderEntityId: Int
    @AddedIn(GI_1_1_0)
    var iceId: Int
}
