package org.anime_game_servers.multi_proto.gi.data.activity.aster

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
interface AsterActivityDetailInfo {
    var asterLittle: AsterLittleDetailInfo
    var asterMid: AsterMidDetailInfo
    var asterLarge: AsterLargeDetailInfo
    var asterProgress: AsterProgressDetailInfo
    var asterCredit: Int
    var asterToken: Int
    var isSpecialRewardTaken: Boolean
    var isContentClosed: Boolean
    var contentCloseTime: Int
}