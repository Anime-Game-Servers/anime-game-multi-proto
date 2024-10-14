package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.player

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum("OtherPlayerEnterHomeNotify", alternativeNames = ["Reason"])
internal enum class OtherEnterHomeReason {
    @AltName("REASON_INVALID")
    INVALID,
    @AltName("REASON_ENTER")
    ENTER,
    @AltName("REASON_LEAVE")
    LEAVE,
}
