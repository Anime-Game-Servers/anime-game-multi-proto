package org.anime_game_servers.multi_proto.gi.data.activity.blessing

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface BlessingActivityDetailInfo {
    var contentCloseTime: Int
    var curDayScanNum: Int
    var curDayScanType: Int
    var isActivated: Boolean
    var isContentClosed: Boolean
    var nextRefreshTime: Int
    var picNumMap: Map<Int, Int>
    var redeemRewardNum: Int
}
