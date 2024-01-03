package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_0_0)
@ProtoModel
interface ShortAbilityHashPair {
    var abilityConfigHash: Int
    var abilityNameHash: Int
}
