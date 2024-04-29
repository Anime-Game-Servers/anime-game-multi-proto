package data.battle_pass

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface BattlePassSchedule {
    var beginTime: Int
    var curCycle: BattlePassCycle
    var endTime: Int
    var isExtraPaidRewardTaken: Boolean
    var isViewed: Boolean
    var level: Int
    var point: Int
    var productInfo: BattlePassProduct
    var rewardTakenList: List<BattlePassRewardTag>
    var scheduleId: Int
    var unlockStatus: BattlePassUnlockStatus
    @AddedIn(GI_1_0_0)
    var curCyclePoints: Int
    @AddedIn(GI_2_4_0)
    var paidPlatformFlags: Int
}
