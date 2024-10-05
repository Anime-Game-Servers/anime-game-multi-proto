package org.anime_game_servers.multi_proto.gi.data.activity.winter_camp

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface WinterCampActivityDetailInfo {
    var battleInfo: WinterCampStageInfo
    var battleTakenRewardList: List<Int>
    var exploreInfo: WinterCampStageInfo
    var exploreTakenRewardList: List<Int>
    var isContentClosed: Boolean
    var raceInfoList: List<WinterCampRaceStageInfo>
    var usedItemList: List<ItemParam>
    var wishIdList: List<Int>
}
