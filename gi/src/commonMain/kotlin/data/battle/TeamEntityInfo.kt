package data.battle

import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface TeamEntityInfo {
    var authorityPeerId: Int
    var teamAbilityInfo: AbilitySyncStateInfo
    var teamEntityId: Int
}
