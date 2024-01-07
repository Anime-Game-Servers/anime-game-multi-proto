package data.team

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface TeamEntityInfo {
    var authorityPeerId:Int
    var teamAbilityInfo: AbilitySyncStateInfo
    var teamEntityId:Int
}