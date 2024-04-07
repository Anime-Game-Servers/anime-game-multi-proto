package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface EvtMonsterDoBlink {
    var entityId: Int
    var targetPos: Vector
    var targetRot: Vector
}
