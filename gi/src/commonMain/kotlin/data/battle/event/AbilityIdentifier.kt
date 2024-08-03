package data.battle.event

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityIdentifier {
    var abilityCasterId: Int
    var instancedAbilityId: Int
    var instancedModifierId: Int
    var localId: Int
    var modifierOwnerId: Int
    @AddedIn(GI_1_5_0)
    var isServerbuffModifier: Boolean
}
