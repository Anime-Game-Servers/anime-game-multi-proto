package org.anime_game_servers.multi_proto.gi.data.dungeon.progression

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_6_0)
@ProtoEnum
internal enum class DungeonRestartReason {
    DUNGEON_RESTART_REASON_NONE,
    DUNGEON_RESTART_REASON_DAILY_RESTART,
    DUNGEON_RESTART_REASON_DIE_RETRY,
}
