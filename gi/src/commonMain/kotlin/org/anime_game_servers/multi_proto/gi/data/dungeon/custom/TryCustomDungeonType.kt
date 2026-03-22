package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_5_0)
@ProtoEnum
internal enum class TryCustomDungeonType {
    @AltName("TRY_CUSTOM_DUNGEON_TYPE_NONE")
    TRY_CUSTOM_DUNGEON_NONE,
    @AltName("TRY_CUSTOM_DUNGEON_TYPE_ROOM")
    TRY_CUSTOM_DUNGEON_ROOM,
    @AltName("TRY_CUSTOM_DUNGEON_TYPE_ALL")
    TRY_CUSTOM_DUNGEON_ALL,
    @AltName("TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY")
    TRY_CUSTOM_DUNGEON_OFFICIAL_PLAY,
}
