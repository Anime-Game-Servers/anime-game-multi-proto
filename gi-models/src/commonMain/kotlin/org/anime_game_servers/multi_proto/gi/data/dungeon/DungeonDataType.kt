package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class DungeonDataType {
    DUNGEON_DATA_NONE,
    DUNGEON_DATA_END_TIME,
    DUNGEON_DATA_MONSTER_DIE_COUNT,
    @AddedIn(GI_CB2)
    DUNGEON_DATA_LEVEL_CONFIG_ID,
    @AddedIn(GI_0_9_0)
    DUNGEON_DATA_TOWER_MONTHLY_LEVEL_CONFIG_ID,
    @AddedIn(GI_0_9_0)
    DUNGEON_DATA_TOWER_FLOOR_LEVEL_CONFIG_ID,
}
