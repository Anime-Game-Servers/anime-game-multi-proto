package data.player

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
interface ShortAbilityHashPair {
    var abilityConfigHash: Int
    var abilityNameHash: Int
}
