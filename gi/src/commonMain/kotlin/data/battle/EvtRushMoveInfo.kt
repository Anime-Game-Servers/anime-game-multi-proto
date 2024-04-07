package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface EvtRushMoveInfo {
    var entityId: Int
    var faceAngleCompact: Int
    var pos: Vector
    var rushAttackTargetPos: Vector
    var rushToPos: Vector
    var stateNameHash: Int
    @AltName("timeRange")
    var timerange: Float
    var velocity: Vector
}
