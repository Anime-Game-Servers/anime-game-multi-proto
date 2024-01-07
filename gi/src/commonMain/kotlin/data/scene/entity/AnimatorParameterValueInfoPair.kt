package data.scene.entity

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
internal interface AnimatorParameterValueInfoPair {
    var nameId: Int
    var animatorPara: AnimatorParameterValueInfo
}
