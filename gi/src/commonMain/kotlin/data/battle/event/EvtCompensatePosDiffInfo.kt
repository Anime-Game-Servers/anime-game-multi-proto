package data.battle.event

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface EvtCompensatePosDiffInfo {
    var curHash: Int
    var curPos: Vector
    var entityId: Int
    var faceAngleCompact: Int
    var normalizedTimeCompact: Int
}
