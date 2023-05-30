package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_1_0)
@ProtoEnum
enum class AsterLittleStageState {
    ASTER_LITTLE_STAGE_NONE,
    ASTER_LITTLE_STAGE_UNSTARTED,
    ASTER_LITTLE_STAGE_STARTED,
    ASTER_LITTLE_STAGE_FINISHED,
}