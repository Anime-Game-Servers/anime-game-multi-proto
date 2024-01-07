package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.ability.AbilitySyncStateInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
internal interface MPLevelEntityInfo {
    var entityId: Int
    var authorityPeerId: Int
    var abilityInfo: AbilitySyncStateInfo
}
