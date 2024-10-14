package org.anime_game_servers.multi_proto.gi.data.blossom

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class BlossomScheduleState {
    BLOSSOM_SCHEDULE_NONE,
    BLOSSOM_SCHEDULE_INIT,
    BLOSSOM_SCHEDULE_IN_PROGRESS,
    BLOSSOM_SCHEDULE_REWARD,
}
