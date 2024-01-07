package data.activity.delivery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface DeliveryActivityDetailInfo {
    var dayIndex: Int
    var finishedDeliveryQuestIndex: List<Int>
    var isTakenReward: Boolean
}