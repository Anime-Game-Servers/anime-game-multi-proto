package data.scene.entity

import annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface MPLevelEntityInfo {
    var entityId: Int
    var authorityPeerId: Int
    var abilityInfo: AbilitySyncStateInfo
}
