package data.activity.salesman

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
interface SalesmanActivityDetailInfo {
    var status: SalesmanStatusType
    var dayIndex: Int
    var lastDeliverTime: Int
    var deliverCount: Int
    var selectedRewardIdMap: Map<Int, Int>
}