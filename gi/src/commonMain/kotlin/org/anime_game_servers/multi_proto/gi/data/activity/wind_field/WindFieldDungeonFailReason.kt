package org.anime_game_servers.multi_proto.gi.data.activity.wind_field

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_1_0)
@ProtoEnum
internal enum class WindFieldDungeonFailReason {
    @AltName("WIND_FIELD_DUNGEON_FAIL_REASON_NONE")
    WIND_FIELD_DUNGEON_FAIL_NONE,
    @AltName("WIND_FIELD_DUNGEON_FAIL_REASON_CANCEL")
    WIND_FIELD_DUNGEON_FAIL_CANCEL,
    @AltName("WIND_FIELD_DUNGEON_FAIL_REASON_TIMEOUT")
    WIND_FIELD_DUNGEON_FAIL_TIMEOUT,
    @AltName("WIND_FIELD_DUNGEON_FAIL_REASON_ALL_AVATAR_DIE")
    WIND_FIELD_DUNGEON_FAIL_ALL_AVATAR_DIE,
    @AltName("WIND_FIELD_DUNGEON_FAIL_REASON_LUA_INTERRUPT")
    WIND_FIELD_DUNGEON_FAIL_LUA_INTERRUPT,
}
