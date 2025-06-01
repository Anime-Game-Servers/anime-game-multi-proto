package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum("PlayerLogoutReq", alternativeNames = ["Reason"])
internal enum class LogoutReason {
    @AltName("REASON_DISCONNECT")
    DISCONNECT,
    @AltName("REASON_CLIENT_REQ")
    CLIENT_REQ,
    @AltName("REASON_TIMEOUT")
    TIMEOUT,
    @AltName("REASON_ADMIN_REQ")
    ADMIN_REQ,
    @AltName("REASON_SERVER_CLOSE")
    SERVER_CLOSE,
    @AltName("REASON_GM_CLEAR")
    GM_CLEAR,
    @AltName("REASON_PLAYER_TRANSFER")
    PLAYER_TRANSFER,
    @AddedIn(GI_0_9_0)
    @AltName("REASON_CLIENT_CHECKSUM_INVALID")
    CLIENT_CHECKSUM_INVALID,
}