package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_3_2_0


@AddedIn(GI_1_6_0)
@ProtoEnum
enum class GalleryStopReason {
    @AltName("GALLERY_STOP_REASON_NONE")
    GALLERY_STOP_NONE,
    @AltName("GALLERY_STOP_REASON_TIMEUP", "GALLERY_STOP_REASON_TIME_UP", "GALLERY_STOP_TIMEUP")
    GALLERY_STOP_TIME_UP,
    @AltName("GALLERY_STOP_REASON_CLIENT_INTERRUPT")
    GALLERY_STOP_CLIENT_INTERRUPT,
    @RemovedIn(GI_2_2_0)
    @AltName("GALLERY_STOP_REASON_LUA_INTERRUPT")
    GALLERY_STOP_LUA_INTERRUPT,
    @AddedIn(GI_2_2_0)
    @AltName("GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS")
    GALLERY_STOP_LUA_INTERRUPT_SUCCESS,
    @AddedIn(GI_2_2_0)
    @AltName("GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL")
    GALLERY_STOP_LUA_INTERRUPT_FAIL,
    @AddedIn(GI_2_3_0)
    @AltName("GALLERY_STOP_REASON_OWNER_LEAVE_SCENE")
    GALLERY_STOP_OWNER_LEAVE_SCENE,
    @AddedIn(GI_2_6_0)
    @AltName("GALLERY_STOP_REASON_PLAY_INIT_FAILED")
    GALLERY_STOP_PLAY_INIT_FAILED,
    @AddedIn(GI_2_6_0)
    @AltName("GALLERY_STOP_REASON_OTHER_PLAYER_ENTER")
    GALLERY_STOP_OTHER_PLAYER_ENTER,
    @AddedIn(GI_2_6_0)
    @AltName("GALLERY_STOP_REASON_AVATAR_DIE")
    GALLERY_STOP_AVATAR_DIE,
    @AddedIn(GI_2_6_0)
    @AltName("GALLERY_STOP_REASON_FINISHED")
    GALLERY_STOP_FINISHED,
    @AddedIn(GI_3_2_0)
    @AltName("GALLERY_STOP_REASON_FUNGUS_ALL_DIE")
    GALLERY_STOP_FUNGUS_ALL_DIE,
}