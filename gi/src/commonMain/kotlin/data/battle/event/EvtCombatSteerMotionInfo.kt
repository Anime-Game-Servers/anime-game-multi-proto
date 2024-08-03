package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface EvtCombatSteerMotionInfo {
    var entityId: Int
    var faceDir: Vector
    var pos: Vector
    var velocity: Vector
}
