package data.general.ability

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_5_0)
@ProtoModel
internal interface AbilityMixinRecoverInfo {
    var localId: Int
    var dataList: List<Int>
    var isServerbuffModifier: Boolean
    var massivePropList: List<MassivePropSyncInfo>
    @OneOf(
        OneOfEntry(Int::class, "instanced_ability_id"),
        OneOfEntry(Int::class, "instanced_modifier_id"),
        allowTypedBasedMapping = false
    )
    var Source: OneOfType
}