package data.dungeon

import annotations.AddedIn
import data.scene.entity.WeeklyBossResinDiscountInfo
import messages.VERSION.*
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface DungeonEntryInfo {
    var dungeonId: Int
    var isPassed: Boolean
    var leftTimes: Int
    @AddedIn(VCB2)
    var startTime: Int
    @AddedIn(VCB2)
    var endTime: Int
    @AddedIn(V0_9_0)
    var maxBossChestNum: Int
    @AddedIn(V0_9_0)
    var bossChestNum: Int
    @AddedIn(V1_2_0)
    var nextRefreshTime: Int
    @AddedIn(V1_5_0)
    var weeklyBossResinDiscountInfo: WeeklyBossResinDiscountInfo
}