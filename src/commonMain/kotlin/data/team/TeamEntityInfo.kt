package data.team

import annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface TeamEntityInfo {
    var authorityPeerId:Int
    var teamAbilityInfo: AbilitySyncStateInfo
    var teamEntityId:Int
}