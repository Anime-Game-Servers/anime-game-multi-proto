package data.activity.aster

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
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