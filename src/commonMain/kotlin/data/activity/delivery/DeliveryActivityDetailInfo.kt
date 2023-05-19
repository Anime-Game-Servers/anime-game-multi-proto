package data.activity.delivery

import annotations.AddedIn
import data.generall.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface DeliveryActivityDetailInfo {
    var dayIndex: Int
    var finishedDeliveryQuestIndex: List<Int>
    var isTakenReward: Boolean
}