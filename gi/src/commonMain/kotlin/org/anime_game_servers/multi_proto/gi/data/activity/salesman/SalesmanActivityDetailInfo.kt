package org.anime_game_servers.multi_proto.gi.data.activity.salesman

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
interface SalesmanActivityDetailInfo {
    var status: SalesmanStatusType
    var dayIndex: Int
    var lastDeliverTime: Int
    var deliverCount: Int
    var selectedRewardIdMap: Map<Int, Int>
}