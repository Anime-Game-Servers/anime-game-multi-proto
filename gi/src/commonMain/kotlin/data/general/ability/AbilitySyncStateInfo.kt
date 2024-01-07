package data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilitySyncStateInfo {
    var isInited: Boolean
    var dynamicValueMap: List<AbilityScalarValueEntry>
    var appliedAbilities: List<AbilityAppliedAbility>
    var appliedModifiers: List<AbilityAppliedModifier>
    var mixinRecoverInfos: List<AbilityMixinRecoverInfo>
    var sgvDynamicValueMap: List<AbilityScalarValueEntry>
}