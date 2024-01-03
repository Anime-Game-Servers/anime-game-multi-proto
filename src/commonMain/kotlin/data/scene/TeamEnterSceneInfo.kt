package data.scene

import annotations.AddedIn
import data.general.ability.AbilityControlBlock
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB1
import messages.VERSION.V1_6_0

@AddedIn(VCB1)
@ProtoModel
internal interface TeamEnterSceneInfo {
    var teamEntityId: Int
    var teamAbilityInfo: AbilitySyncStateInfo
    @AddedIn(V1_6_0)
    var abilityControlBlock: AbilityControlBlock
}
