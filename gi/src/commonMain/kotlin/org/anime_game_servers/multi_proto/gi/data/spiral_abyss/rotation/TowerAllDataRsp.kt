package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.rotation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.spiral_abyss.TowerMonthlyBrief

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface TowerAllDataRsp {
    var retcode: Retcode
    var commemorativeRewardId: Int
    var curLevelRecord: TowerCurLevelRecord
    var dailyFloorId: Int
    var dailyLevelIndex: Int
    var floorOpenTimeMap: Map<Int, Int>
    var isFirstInteract: Boolean
    var monthlyBrief: TowerMonthlyBrief
    var nextScheduleChangeTime: Int
    var skipFloorGrantedRewardItemMap: Map<Int, Int>
    var skipToFloorIndex: Int
    var towerFloorRecordList: List<TowerFloorRecord>
    var towerScheduleId: Int
    var validTowerRecordNum: Int
    @AddedIn(GI_1_0_0)
    var isFinishedEntranceFloor: Boolean
    @AddedIn(GI_1_2_0)
    var scheduleStartTime: Int
    @AddedIn(GI_1_5_0)
    var lastScheduleMonthlyBrief: TowerMonthlyBrief
}
