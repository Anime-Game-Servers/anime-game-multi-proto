package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface GachaInfo {
    var beginTime: Int
    var costItemId: Int
    var costItemNum: Int
    var endTime: Int
    var gachaPrefabPath: String
    var gachaProbUrl: String
    var gachaRecordUrl: String
    var gachaType: Int
    var scheduleId: Int
    @AddedIn(GI_0_9_0)
    var gachaPreviewPrefabPath: String
    @AddedIn(GI_0_9_0)
    var gachaSortId: Int
    @AddedIn(GI_0_9_0)
    var gachaTimesLimit: Int
    @AddedIn(GI_0_9_0)
    var leftGachaTimes: Int
    @AddedIn(GI_0_9_0)
    var tenCostItemId: Int
    @AddedIn(GI_0_9_0)
    var tenCostItemNum: Int
    @AddedIn(GI_1_1_0)
    var gachaProbUrlOversea: String
    @AddedIn(GI_1_1_0)
    var gachaRecordUrlOversea: String
    @AddedIn(GI_1_2_0)
    var gachaUpInfoList: List<GachaUpInfo>
    @AddedIn(GI_1_6_0)
    var displayUp4ItemList: List<Int>
    @AddedIn(GI_1_6_0)
    var displayUp5ItemList: List<Int>
    @AddedIn(GI_1_6_0)
    var titleTextmap: String
    @AddedIn(GI_2_0_0)
    var isNewWish: Boolean
    @AddedIn(GI_2_0_0)
    var wishItemId: Int
    @AddedIn(GI_2_0_0)
    var wishMaxProgress: Int
    @AddedIn(GI_2_0_0)
    var wishProgress: Int
    @AddedIn(GI_3_1_0)
    var curScheduleDailyGachaTimes: Int
}
