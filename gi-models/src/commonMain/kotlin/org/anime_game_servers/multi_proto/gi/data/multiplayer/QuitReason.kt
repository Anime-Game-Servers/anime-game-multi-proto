package org.anime_game_servers.multi_proto.gi.data.multiplayer

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_5_3_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("PlayerQuitFromMpNotify")
internal enum class QuitReason {
    @AltName("QUIT_REASON_INVALID")
    INVALID,
    @AltName("QUIT_REASON_HOST_NO_OTHER_PLAYER")
    HOST_NO_OTHER_PLAYER,
    @AltName("QUIT_REASON_KICK_BY_HOST")
    KICK_BY_HOST,
    @AltName("QUIT_REASON_BACK_TO_MY_WORLD")
    BACK_TO_MY_WORLD,
    @AltName("QUIT_REASON_KICK_BY_HOST_LOGOUT")
    KICK_BY_HOST_LOGOUT,
    @AddedIn(GI_1_1_0)
    @AltName("QUIT_REASON_KICK_BY_HOST_BLOCK")
    KICK_BY_HOST_BLOCK,
    @AddedIn(GI_1_1_0)
    @AltName("QUIT_REASON_BE_BLOCKED")
    BE_BLOCKED,
    @AddedIn(GI_1_5_0)
    @AltName("QUIT_REASON_KICK_BY_HOST_ENTER_HOME")
    KICK_BY_HOST_ENTER_HOME,
    @AddedIn(GI_1_5_0)
    @AltName("QUIT_REASON_KICK_BY_PLAY")
    KICK_BY_PLAY,
    @AddedIn(GI_1_6_0)
    @AltName("QUIT_REASON_HOST_SCENE_INVALID")
    HOST_SCENE_INVALID,
    @AddedIn(GI_2_8_0)
    @AltName("QUIT_REASON_KICK_BY_ISLAND_PARTY_GALLERY_START_FAILED")
    KICK_BY_ISLAND_PARTY_GALLERY_START_FAILED,
    // todo verify they didn't get added in 5.1.0 or 5.2.0
    @AddedIn(GI_5_3_0)
    @AltName("QUIT_REASON_KICK_BY_HOST_ADS_BLOCK")
    KICK_BY_HOST_ADS_BLOCK,
    @AddedIn(GI_5_3_0)
    @AltName("QUIT_REASON_BE_ADS_BLOCKED")
    BE_ADS_BLOCKED,
}
