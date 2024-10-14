package org.anime_game_servers.multi_proto.gi.data.dungeon.challenge

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_5_0)
@ProtoEnum
internal enum class CustomDungeonFinishType {
    @AltName("CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL")
    CUSTOM_DUNGEON_FINISH_PLAY_NORMAL,
    @AltName("CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY")
    CUSTOM_DUNGEON_FINISH_PLAY_TRY,
    @AltName("CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY")
    CUSTOM_DUNGEON_FINISH_EDIT_TRY,
    @AltName("CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL")
    CUSTOM_DUNGEON_FINISH_SELF_PLAY_NORMAL,
}
