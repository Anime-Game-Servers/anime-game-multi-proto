package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface EvtSyncTransform {
    var entityId: Int
    var entityPos: Vector
    var entityRot: Vector
}
