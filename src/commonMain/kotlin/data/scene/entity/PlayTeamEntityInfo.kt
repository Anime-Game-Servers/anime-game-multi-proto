package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_1_0
import messages.VERSION.V1_2_0

@AddedIn(V1_1_0)
@ProtoModel
internal interface PlayTeamEntityInfo {
    var entityId: Int
    var playerUid: Int
    var authorityPeerId: Int
    @RemovedIn(V1_2_0)
    var playId: Int
    var gadgetConfigId: Int
    var abilityInfo: AbilitySyncStateInfo
}
