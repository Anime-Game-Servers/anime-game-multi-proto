package data.ability

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface EntityAbilityInvokeEntry {
    var entityId: Int
    var invokes: List<AbilityInvokeEntry>
}
