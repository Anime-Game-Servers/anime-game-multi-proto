package data.general.ability

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AbilitySyncStateInfo {
    var isInited: Boolean
    var dynamicValueMap: List<AbilityScalarValueEntry>
    var appliedAbilities: List<AbilityAppliedAbility>
    var appliedModifiers: List<AbilityAppliedModifier>
    var mixinRecoverInfos: List<AbilityMixinRecoverInfo>
    var sgvDynamicValueMap: List<AbilityScalarValueEntry>
}