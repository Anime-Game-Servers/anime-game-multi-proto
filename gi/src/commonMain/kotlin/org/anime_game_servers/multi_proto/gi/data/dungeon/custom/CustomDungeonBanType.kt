package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_5_0)
@ProtoEnum
internal enum class CustomDungeonBanType {
    CUSTOM_DUNGEON_BAN_TYPE_NONE,
    CUSTOM_DUNGEON_BAN_TYPE_LAYOUT,
}
