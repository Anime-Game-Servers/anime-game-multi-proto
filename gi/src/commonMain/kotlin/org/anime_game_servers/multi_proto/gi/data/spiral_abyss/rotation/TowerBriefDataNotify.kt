package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.rotation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface TowerBriefDataNotify {
    var lastFloorIndex: Int
    var lastLevelIndex: Int
    var nextScheduleChangeTime: Int
    var totalStarNum: Int
    var towerScheduleId: Int
    @AddedIn(GI_1_0_0)
    var isFinishedEntranceFloor: Boolean
    @AddedIn(GI_1_2_0)
    var scheduleStartTime: Int
}
