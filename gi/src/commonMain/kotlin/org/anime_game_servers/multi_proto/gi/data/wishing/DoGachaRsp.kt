package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface DoGachaRsp {
    var gachaItemList: List<GachaItem>
    var gachaScheduleId: Int
    var gachaTimes: Int
    var gachaType: Int
    var newGachaRandom: Int
    var retcode: Int
    @AddedIn(GI_0_9_0)
    var costItemId: Int
    @AddedIn(GI_0_9_0)
    var costItemNum: Int
    @AddedIn(GI_0_9_0)
    var gachaTimesLimit: Int
    @AddedIn(GI_0_9_0)
    var leftGachaTimes: Int
    @AddedIn(GI_0_9_0)
    var tenCostItemId: Int
    @AddedIn(GI_0_9_0)
    var tenCostItemNum: Int
    @AddedIn(GI_2_0_0)
    var wishItemId: Int
    @AddedIn(GI_2_0_0)
    var wishMaxProgress: Int
    @AddedIn(GI_2_0_0)
    var wishProgress: Int
    @AddedIn(GI_2_3_0)
    var dailyGachaTimes: Int
    @AddedIn(GI_2_3_0)
    var isUnderMinorsRestrict: Boolean
    @AddedIn(GI_3_1_0)
    var curScheduleDailyGachaTimes: Int
    @AddedIn(GI_3_1_0)
    var isUnderGeneralRestrict: Boolean
}
