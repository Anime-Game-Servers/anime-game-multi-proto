package org.anime_game_servers.multi_proto.gi.data.activity.salesman

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface SalesmanActivityDetailInfo {
    var dayIndex: Int
    var deliverCount: Int
    var lastDeliverTime: Int
    var selectedRewardIdMap: Map<Int, Int>
    var status: SalesmanStatusType
    @AddedIn(GI_1_2_0)
    var condDayCount: Int
    @AddedIn(GI_1_2_0)
    var dayRewardId: Int
    @AddedIn(GI_1_2_0)
    var isHasTakenSpecialReward: Boolean
    @AddedIn(GI_1_2_0)
    var isTodayHasDelivered: Boolean
    @AddedIn(GI_1_2_0)
    var specialRewardPreviewId: Int
}