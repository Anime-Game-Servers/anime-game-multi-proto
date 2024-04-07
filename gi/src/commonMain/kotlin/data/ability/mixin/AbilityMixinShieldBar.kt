package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface AbilityMixinShieldBar {
    var elementType: Int
    var maxShield: Float
    var shield: Float
    @AddedIn(GI_2_3_0)
    var playerNum: Int
}
