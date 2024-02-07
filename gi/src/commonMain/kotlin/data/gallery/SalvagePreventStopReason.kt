package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_2_4_0

@AddedIn(GI_2_4_0)
@ProtoEnum
enum class SalvagePreventStopReason {
    @AltName("SALVAGE_PREVENT_STOP_REASON_NONE")
    SALVAGE_PREVENT_STOP_NONE,
    @AltName("SALVAGE_PREVENT_STOP_REASON_SUCCESS")
    SALVAGE_PREVENT_STOP_SUCCESS,
    @AltName("SALVAGE_PREVENT_STOP_REASON_ARRIVAL")
    SALVAGE_PREVENT_STOP_ARRIVAL,
    @AltName("SALVAGE_PREVENT_STOP_REASON_INTERRUPT")
    SALVAGE_PREVENT_STOP_INTERRUPT,
    @AltName("SALVAGE_PREVENT_STOP_REASON_LEAVE")
    SALVAGE_PREVENT_STOP_LEAVE,
    @AltName("SALVAGE_PREVENT_STOP_REASON_FULL")
    SALVAGE_PREVENT_STOP_FULL,
    @AltName("SALVAGE_PREVENT_STOP_REASON_AWAY")
    SALVAGE_PREVENT_STOP_AWAY
}