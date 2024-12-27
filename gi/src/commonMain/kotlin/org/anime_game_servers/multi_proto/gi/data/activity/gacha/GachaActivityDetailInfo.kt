package org.anime_game_servers.multi_proto.gi.data.activity.gacha

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface GachaActivityDetailInfo {
    var gachaStageDataList: List<GachaStageData>
    var haveGetRobotList: List<Int>
    var haveRewardRobotNumMap: Map<Int, Int>
    var robotFinishNum: Int
    var robotNumMap: Map<Int, Int>
    var techCreateRobotId: Int
}
