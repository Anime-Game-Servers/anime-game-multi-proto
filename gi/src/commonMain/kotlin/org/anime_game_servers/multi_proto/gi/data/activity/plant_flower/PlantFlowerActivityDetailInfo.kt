package org.anime_game_servers.multi_proto.gi.data.activity.plant_flower

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface PlantFlowerActivityDetailInfo {
    var dayIndex: Int
    var isContentClosed: Boolean
    var isTodayHasAwarded: Boolean
    var todaySeedRewardId: Int
    var usedFlowerNumMap: Map<Int, Int>
    var wishFlowerNumMap: Map<Int, Int>
}
