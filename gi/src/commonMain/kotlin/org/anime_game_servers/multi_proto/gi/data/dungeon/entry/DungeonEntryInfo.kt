package org.anime_game_servers.multi_proto.gi.data.dungeon.entry

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.WeeklyBossResinDiscountInfo
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface DungeonEntryInfo {
    var dungeonId: Int
    var isPassed: Boolean
    var leftTimes: Int
    @AddedIn(GI_CB2)
    var startTime: Int
    @AddedIn(GI_CB2)
    var endTime: Int
    @AddedIn(GI_0_9_0)
    var maxBossChestNum: Int
    @AddedIn(GI_0_9_0)
    var bossChestNum: Int
    @AddedIn(GI_1_2_0)
    var nextRefreshTime: Int
    @AddedIn(GI_1_5_0)
    var weeklyBossResinDiscountInfo: WeeklyBossResinDiscountInfo
}