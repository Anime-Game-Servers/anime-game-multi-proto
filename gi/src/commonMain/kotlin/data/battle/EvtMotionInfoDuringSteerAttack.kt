package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface EvtMotionInfoDuringSteerAttack {
    var entityId: Int
    var faceDir: Vector
    var pos: Vector
    var velocity: Vector
}
