package org.anime_game_servers.multi_proto.gi.data.activity.vintage

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface VintageActivityDetailInfo {
    var boothData: VintageBoothUsedItemData
    var campStageMap: Map<Int, VintageCampChallengeStageData>
    var huntingStageMap: Map<Int, VintageHuntingStageData>
    var isContentClosed: Boolean
    var marketInfo: VintageMarketInfo
    var presentStageMap: Map<Int, VintagePresentStageData>
}
