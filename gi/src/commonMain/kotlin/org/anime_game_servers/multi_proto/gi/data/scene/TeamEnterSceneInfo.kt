package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityControlBlock
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_CB1)
@ProtoModel
internal interface TeamEnterSceneInfo {
    var teamEntityId: Int
    var teamAbilityInfo: org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
    @AddedIn(GI_1_6_0)
    var abilityControlBlock: org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityControlBlock
}
