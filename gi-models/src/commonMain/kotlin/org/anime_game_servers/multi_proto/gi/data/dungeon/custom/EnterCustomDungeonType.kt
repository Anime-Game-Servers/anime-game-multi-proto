package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_5_0)
@ProtoEnum
internal enum class EnterCustomDungeonType {
    @AltName("ENTER_CUSTOM_DUNGEON_TYPE_NONE")
    ENTER_CUSTOM_DUNGEON_NONE,
    @AltName("ENTER_CUSTOM_DUNGEON_TYPE_EDIT")
    ENTER_CUSTOM_DUNGEON_EDIT,
    @AltName("ENTER_CUSTOM_DUNGEON_TYPE_PLAY")
    ENTER_CUSTOM_DUNGEON_PLAY,
    @AltName("ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL")
    ENTER_CUSTOM_DUNGEON_OFFICIAL,
}
