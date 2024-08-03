package org.anime_game_servers.multi_proto.gi.data.activity.aster

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_1_0)
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