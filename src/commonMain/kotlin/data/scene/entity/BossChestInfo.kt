package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface BossChestInfo {
    var monsterConfigId: Int
    var resin: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>
    @AddedIn(VERSION.V1_5_0)
    var uidDiscountMap: Map<Int, WeeklyBossResinDiscountInfo>
}
