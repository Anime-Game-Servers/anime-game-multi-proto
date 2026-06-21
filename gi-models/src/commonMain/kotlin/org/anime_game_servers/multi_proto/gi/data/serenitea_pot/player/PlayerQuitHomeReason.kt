package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.player

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum("PlayerQuitFromHomeNotify" , alternativeNames = ["QuitReason"])
internal enum class PlayerQuitHomeReason {
    @AltName("QUIT_REASON_INVALID")
    INVALID,
    @AltName("QUIT_REASON_KICK_BY_HOST")
    KICK_BY_HOST,
    @AltName("QUIT_REASON_BACK_TO_MY_WORLD")
    BACK_TO_MY_WORLD,
    @AltName("QUIT_REASON_HOME_BLOCKED")
    HOME_BLOCKED,
    @AltName("QUIT_REASON_HOME_IN_EDIT_MODE")
    HOME_IN_EDIT_MODE,
    @AltName("QUIT_REASON_BY_MUIP")
    BY_MUIP,
    @AltName("QUIT_REASON_CUR_MODULE_CLOSED")
    CUR_MODULE_CLOSED,
}
