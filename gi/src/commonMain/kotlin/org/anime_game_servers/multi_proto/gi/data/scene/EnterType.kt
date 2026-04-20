package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_4_0_0
import org.anime_game_servers.core.base.Version.GI_6_1_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
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
    @AddedIn(GI_1_5_0)
    @AltName("ENTER_TYPE_SELF_HOME")
    ENTER_SELF_HOME,
    @AddedIn(GI_1_5_0)
    @AltName("ENTER_TYPE_OTHER_HOME")
    ENTER_OTHER_HOME,
    @AddedIn(GI_2_1_0)
    @AltName("ENTER_TYPE_GOTO_RECREATE")
    ENTER_GOTO_RECREATE,
    @AddedIn(GI_4_0_0)
    @AltName("ENTER_TYPE_BY_TPL")
    ENTER_GOTO_BY_TPL,
    @AddedIn(GI_6_1_0)
    @AltName("ENTER_TYPE_BEYOND")
    ENTER_BEYOND,
    @AddedIn(GI_6_1_0)
    @AltName("ENTER_TYPE_HALL")
    ENTER_HALL,
}