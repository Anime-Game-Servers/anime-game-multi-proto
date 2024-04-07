package data.ability

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityInvokeEntryHead {
    var instancedAbilityId: Int
    var instancedModifierId: Int
    var localId: Int
    var modifierConfigLocalId: Int
    var targetId: Int
    @AddedIn(GI_1_5_0)
    var isServerbuffModifier: Boolean
    @AddedIn(GI_1_5_0)
    var serverBuffUid: Int
}
