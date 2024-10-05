package org.anime_game_servers.multi_proto.gi.data.activity.coin_collect

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface CoinCollectLevelData {
    var doubleBestTeamInfoList: List<CoinCollectTeamInfoData>
    var isLevelOpen: Boolean
    var levelId: Int
    var singleBestTeamInfo: CoinCollectTeamInfoData
    var doubleBestCollectNum: Int
    var doubleBestPassTimeMs: Int
    var isHavePlayDoubleLevel: Boolean
    var isHavePlaySingleLevel: Boolean
    var isHaveWatchedCutscene: Boolean
    var lastChooseSkillNo: Int
    var singleBestCollectNum: Int
    var singleBestPassTimeMs: Int
}
