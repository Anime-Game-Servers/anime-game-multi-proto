package org.anime_game_servers.multi_proto.gi.data.multiplayer

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("PlayerPreEnterMpNotify", alternativeNames = ["State"])
internal enum class EnterMpState {
    @AltName("STATE_INVALID")
    INVALID,
    @AltName("STATE_START")
    START,
    @AltName("STATE_TIMEOUT")
    TIMEOUT,
}
