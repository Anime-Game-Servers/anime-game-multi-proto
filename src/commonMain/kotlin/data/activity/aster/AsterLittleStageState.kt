package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_1_0)
@ProtoEnum
enum class AsterLittleStageState {
    @AltName("ASTER_LITTLE_STAGE_STATE_NONE")
    ASTER_LITTLE_STAGE_NONE,
    @AltName("ASTER_LITTLE_STAGE_STATE_UNSTARTED")
    ASTER_LITTLE_STAGE_UNSTARTED,
    @AltName("ASTER_LITTLE_STAGE_STATE_STARTED")
    ASTER_LITTLE_STAGE_STARTED,
    @AltName("ASTER_LITTLE_STAGE_STATE_FINISHED")
    ASTER_LITTLE_STAGE_FINISHED,
}