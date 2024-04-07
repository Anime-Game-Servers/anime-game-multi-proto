package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface AbilityMixinGlobalShield {
    var avatarId: Int
    var heightOffset: Float
    var shieldEffectName: String
    var subShield: Float
    @AddedIn(GI_1_1_0)
    var isCreateEffect: Boolean
    @AddedIn(GI_2_1_0)
    var maxShield: Float
}
