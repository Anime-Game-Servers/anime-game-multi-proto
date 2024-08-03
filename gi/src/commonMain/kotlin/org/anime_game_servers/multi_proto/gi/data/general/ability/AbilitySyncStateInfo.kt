package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilitySyncStateInfo {
    var isInited: Boolean
    var dynamicValueMap: List<org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityScalarValueEntry>
    var appliedAbilities: List<org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityAppliedAbility>
    var appliedModifiers: List<org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityAppliedModifier>
    var mixinRecoverInfos: List<org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityMixinRecoverInfo>
    var sgvDynamicValueMap: List<org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityScalarValueEntry>
}