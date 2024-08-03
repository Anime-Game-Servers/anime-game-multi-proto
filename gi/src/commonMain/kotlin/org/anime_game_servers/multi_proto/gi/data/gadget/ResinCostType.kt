package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_2_0)
@ProtoEnum
enum class ResinCostType {
    RESIN_COST_TYPE_NONE,
    RESIN_COST_TYPE_NORMAL,
    RESIN_COST_TYPE_CONDENSE,
    RESIN_COST_TYPE_REUNION_PRIVILEGE,
    @AddedIn(Version.GI_1_3_0)
    RESIN_COST_TYPE_OP_ACTIVITY,
    @AddedIn(Version.GI_1_4_0)
    RESIN_COST_TYPE_MATERIAL,
}