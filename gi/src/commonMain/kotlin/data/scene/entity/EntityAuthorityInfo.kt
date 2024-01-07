package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
internal interface EntityAuthorityInfo {
    var abilityInfo: AbilitySyncStateInfo
    var rendererChangedInfo: EntityRendererChangedInfo
    var aiInfo: SceneEntityAiInfo
    var bornPos: Vector
    var poseParaList: List<AnimatorParameterValueInfoPair>
    var clientExtraInfo: EntityClientExtraInfo
}
