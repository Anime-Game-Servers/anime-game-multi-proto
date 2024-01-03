package data.scene.entity

import annotations.AddedIn
import data.general.Vector
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_0_0)
@ProtoModel
internal interface EntityAuthorityInfo {
    var abilityInfo: AbilitySyncStateInfo
    var rendererChangedInfo: EntityRendererChangedInfo
    var aiInfo: SceneEntityAiInfo
    var bornPos: Vector
    var poseParaList: List<AnimatorParameterValueInfoPair>
    var clientExtraInfo: EntityClientExtraInfo
}
