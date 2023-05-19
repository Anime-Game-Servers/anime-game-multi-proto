package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
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