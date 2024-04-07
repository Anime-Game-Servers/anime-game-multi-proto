package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface AbilityMixinDoActionBySelfModifierElementDurabilityRatio {
    @AltName("lastDuabilityRatio")
    var lastDurabilityRatio: Float
}
