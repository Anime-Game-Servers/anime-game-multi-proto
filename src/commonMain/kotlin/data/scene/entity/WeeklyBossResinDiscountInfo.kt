package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_5_0)
@ProtoModel
internal interface WeeklyBossResinDiscountInfo {
    var discountNum: Int
    var discountNumLimit: Int
    var resinCost: Int
    var originalResinCost: Int
}
