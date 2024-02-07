package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_2_4_0

@AddedIn(GI_2_4_0)
@ProtoEnum
enum class SalvageEscortStopReason {
    @AltName("SALVAGE_ESCORT_STOP_REASON_NONE")
    SALVAGE_ESCORT_STOP_NONE,
    @AltName("SALVAGE_ESCORT_STOP_REASON_SUCCESS")
    SALVAGE_ESCORT_STOP_SUCCESS,
    @AltName("SALVAGE_ESCORT_STOP_REASON_DUMP")
    SALVAGE_ESCORT_STOP_DUMP,
    @AltName("SALVAGE_ESCORT_STOP_REASON_TIME")
    SALVAGE_ESCORT_STOP_TIME,
    @AltName("SALVAGE_ESCORT_STOP_REASON_INTERRUPT")
    SALVAGE_ESCORT_STOP_INTERRUPT,
    @AltName("SALVAGE_ESCORT_STOP_REASON_LEAVE")
    SALVAGE_ESCORT_STOP_LEAVE,
    @AltName("SALVAGE_ESCORT_STOP_REASON_FULL")
    SALVAGE_ESCORT_STOP_FULL
}