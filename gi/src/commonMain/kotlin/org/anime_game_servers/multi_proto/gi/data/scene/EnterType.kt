package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
internal enum class EnterType {
    @AltName("ENTER_TYPE_NONE")
    ENTER_NONE,
    @AltName("ENTER_TYPE_SELF")
    ENTER_SELF,
    @AltName("ENTER_TYPE_GOTO")
    ENTER_GOTO,
    @AltName("ENTER_TYPE_JUMP")
    ENTER_JUMP,
    @AltName("ENTER_TYPE_OTHER")
    ENTER_OTHER,
    @AltName("ENTER_TYPE_BACK")
    ENTER_BACK,
    @AltName("ENTER_TYPE_DUNGEON")
    ENTER_DUNGEON,
    @AltName("ENTER_TYPE_DUNGEON_REPLAY")
    ENTER_DUNGEON_REPLAY,
    @AltName("ENTER_TYPE_GOTO_BY_PORTAL")
    ENTER_GOTO_BY_PORTAL,
    @AddedIn(Version.GI_1_5_0)
    @AltName("ENTER_TYPE_SELF_HOME")
    ENTER_SELF_HOME,
    @AddedIn(Version.GI_1_5_0)
    @AltName("ENTER_TYPE_OTHER_HOME")
    ENTER_OTHER_HOME,
    @AddedIn(Version.GI_2_1_0)
    @AltName("ENTER_TYPE_GOTO_RECREATE")
    ENTER_GOTO_RECREATE,
}