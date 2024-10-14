package org.anime_game_servers.multi_proto.gi.data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum("CoopReward", "State")
internal enum class CoopRewardState {
    STATE_UNLOCK,
    STATE_LOCK,
    STATE_TAKEN,
}
