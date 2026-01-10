package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.multi_proto.gi.data.general.ability.breakout.BreakoutSnapShot
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface AbilityMixinRecoverInfo {
    var localId: Int
    var dataList: List<Int>
    var isServerbuffModifier: Boolean
    var massivePropList: List<MassivePropSyncInfo>
    @AddedIn(GI_3_3_0)
    var breakoutSnapShot: BreakoutSnapShot

    @OneOf(
        OneOfEntry(Int::class, "instanced_ability_id"),
        OneOfEntry(Int::class, "instanced_modifier_id"),
        allowTypedBasedMapping = false
    )
    var Source: OneOfType
}