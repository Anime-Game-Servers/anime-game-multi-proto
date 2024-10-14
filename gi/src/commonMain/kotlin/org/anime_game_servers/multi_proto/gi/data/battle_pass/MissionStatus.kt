package org.anime_game_servers.multi_proto.gi.data.battle_pass

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum("BattlePassMission")
internal enum class MissionStatus {
    @AltName("MISSION_STATUS_INVALID")
    MISSION_INVALID,
    @AltName("MISSION_STATUS_UNFINISHED")
    MISSION_UNFINISHED,
    @AltName("MISSION_STATUS_FINISHED")
    MISSION_FINISHED,
    @AltName("MISSION_STATUS_POINT_TAKEN")
    MISSION_POINT_TAKEN,
}
