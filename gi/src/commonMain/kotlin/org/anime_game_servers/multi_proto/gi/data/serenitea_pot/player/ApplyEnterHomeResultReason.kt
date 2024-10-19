package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.player

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum("PlayerApplyEnterHomeResultNotify", alternativeNames = ["Reason"])
internal enum class ApplyEnterHomeResultReason {
    @AltName("REASON_PLAYER_JUDGE")
    PLAYER_JUDGE,
    @AltName("REASON_PLAYER_ENTER_OPTION_REFUSE")
    PLAYER_ENTER_OPTION_REFUSE,
    @AltName("REASON_PLAYER_ENTER_OPTION_DIRECT")
    PLAYER_ENTER_OPTION_DIRECT,
    @AltName("REASON_SYSTEM_JUDGE")
    SYSTEM_JUDGE,
    @AltName("REASON_HOST_IN_MATCH")
    HOST_IN_MATCH,
    @AltName("REASON_PS_PLAYER_NOT_ACCEPT_OTHERS")
    PS_PLAYER_NOT_ACCEPT_OTHERS,
    @AltName("REASON_OPEN_STATE_NOT_OPEN")
    OPEN_STATE_NOT_OPEN,
    @AltName("REASON_HOST_IN_EDIT_MODE")
    HOST_IN_EDIT_MODE,
    @AltName("REASON_PRIOR_CHECK")
    PRIOR_CHECK,
}
