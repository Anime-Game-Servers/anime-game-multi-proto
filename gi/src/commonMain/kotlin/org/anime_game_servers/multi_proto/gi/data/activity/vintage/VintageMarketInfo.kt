package org.anime_game_servers.multi_proto.gi.data.activity.vintage

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface VintageMarketInfo {
    var bargainInfoMap: Map<Int, Boolean>
    var curEnvEventList: List<Int>
    var curNpcEventList: List<Int>
    var dealInfo: VintageMarketDealInfo
    var dividendRewardCount: Int
    var helpSkillId: Int
    var isHelpInCd: Boolean
    var isHelpModuleOpen: Boolean
    var isMarketContentFinish: Boolean
    var isMarketContentOpen: Boolean
    var isRoundTipsView: Boolean
    var isStoreContentFinish: Boolean
    var isStoreContentInterrupt: Boolean
    var isStrategyModuleOpen: Boolean
    var nextCanUseHelpRound: Int
    var openStoreList: List<VintageMarketStoreInfo>
    var prevCoinBNum: Int
    var prevCoinCNum: Int
    var storeRound: Int
    var storeRoundIncomeList: List<Int>
    var unlockStrategyList: List<Int>
    var viewedStrategyList: List<Int>
}
