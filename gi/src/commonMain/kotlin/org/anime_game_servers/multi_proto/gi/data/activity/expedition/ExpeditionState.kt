package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_3_0)
@ProtoEnum
internal enum class ExpeditionState {
    @AltName("EXPEDITION_STATE_NONE")
    EXPEDITION_NONE,
    @AltName("EXPEDITION_STATE_STARTED")
    EXPEDITION_STARTED,
    @AltName("EXPEDITION_STATE_FINISHED")
    EXPEDITION_FINISHED,
    @AltName("EXPEDITION_STATE_REWARDED")
    EXPEDITION_REWARDED,
    @AddedIn(GI_2_1_0)
    @AltName("EXPEDITION_STATE_LOCKED")
    EXPEDITION_LOCKED,
}
