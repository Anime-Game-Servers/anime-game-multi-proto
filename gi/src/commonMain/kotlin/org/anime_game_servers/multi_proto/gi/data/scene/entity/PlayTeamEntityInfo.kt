package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface PlayTeamEntityInfo {
    var entityId: Int
    var playerUid: Int
    var authorityPeerId: Int
    @RemovedIn(GI_1_2_0)
    var playId: Int
    var gadgetConfigId: Int
    var abilityInfo: AbilitySyncStateInfo
}
