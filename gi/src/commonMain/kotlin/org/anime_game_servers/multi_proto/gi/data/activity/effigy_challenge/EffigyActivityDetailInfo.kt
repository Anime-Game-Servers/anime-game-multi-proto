package org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface EffigyActivityDetailInfo {
    var curScore: Int
    var dailyInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge.EffigyDailyInfo>
    var lastDifficultyId: Int
    var takenRewardIndexList: List<Int>
}
