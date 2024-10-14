package org.anime_game_servers.multi_proto.gi.data.activity.delivery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface DeliveryActivityDetailInfo {
    var dayIndex: Int
    var finishedDeliveryQuestIndex: List<Int>
    var isTakenReward: Boolean
}
