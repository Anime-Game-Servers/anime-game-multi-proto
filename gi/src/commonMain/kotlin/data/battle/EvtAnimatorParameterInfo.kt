package data.battle

import data.scene.entity.AnimatorParameterValueInfo
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface EvtAnimatorParameterInfo {
    var entityId: Int
    var isServerCache: Boolean
    var nameId: Int
    var value: AnimatorParameterValueInfo
}
