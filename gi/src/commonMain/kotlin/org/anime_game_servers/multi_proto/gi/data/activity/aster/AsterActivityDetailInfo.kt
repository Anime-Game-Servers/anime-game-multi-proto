package org.anime_game_servers.multi_proto.gi.data.activity.aster

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface AsterActivityDetailInfo {
    var asterLittle: org.anime_game_servers.multi_proto.gi.data.activity.aster.AsterLittleDetailInfo
    var asterMid: org.anime_game_servers.multi_proto.gi.data.activity.aster.AsterMidDetailInfo
    var asterLarge: org.anime_game_servers.multi_proto.gi.data.activity.aster.AsterLargeDetailInfo
    var asterProgress: org.anime_game_servers.multi_proto.gi.data.activity.aster.AsterProgressDetailInfo
    var asterCredit: Int
    var asterToken: Int
    var isSpecialRewardTaken: Boolean
    var isContentClosed: Boolean
    var contentCloseTime: Int
}