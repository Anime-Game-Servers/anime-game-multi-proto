package org.anime_game_servers.multi_proto.gi.data.multiplayer

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("PlayerApplyEnterMpResultNotify", alternativeNames = ["Reason"])
internal enum class MpEnterResultReason {
    @AltName("REASON_PLAYER_JUDGE")
    PLAYER_JUDGE,
    @AltName("REASON_SCENE_CANNOT_ENTER")
    SCENE_CANNOT_ENTER,
    @AltName("REASON_PLAYER_CANNOT_ENTER_MP")
    PLAYER_CANNOT_ENTER_MP,
    @AltName("REASON_SYSTEM_JUDGE")
    SYSTEM_JUDGE,
    @AltName("REASON_ALLOW_ENTER_PLAYER_FULL")
    ALLOW_ENTER_PLAYER_FULL,
    @AddedIn(GI_0_9_0)
    @AltName("REASON_WORLD_LEVEL_LOWER_THAN_HOST")
    WORLD_LEVEL_LOWER_THAN_HOST,
    @AddedIn(GI_0_9_0)
    @AltName("REASON_HOST_IN_MATCH")
    HOST_IN_MATCH,
    @AddedIn(GI_0_9_0)
    @AltName("REASON_PLAYER_IN_BLACKLIST")
    PLAYER_IN_BLACKLIST,
    @AddedIn(GI_0_9_0)
    @AltName("REASON_PS_PLAYER_NOT_ACCEPT_OTHERS")
    PS_PLAYER_NOT_ACCEPT_OTHERS,
    @AddedIn(GI_1_1_0)
    @AltName("REASON_HOST_IS_BLOCKED")
    HOST_IS_BLOCKED,
    @AddedIn(GI_1_2_0)
    @AltName("REASON_OTHER_DATA_VERSION_NOT_LATEST")
    OTHER_DATA_VERSION_NOT_LATEST,
    @AddedIn(GI_1_2_0)
    @AltName("REASON_DATA_VERSION_NOT_LATEST")
    DATA_VERSION_NOT_LATEST,
    @AddedIn(GI_1_5_0)
    @AltName("REASON_PLAYER_NOT_IN_PLAYER_WORLD")
    PLAYER_NOT_IN_PLAYER_WORLD,
    @AddedIn(GI_2_1_0)
    @AltName("REASON_MAX_PLAYER")
    MAX_PLAYER,
}
