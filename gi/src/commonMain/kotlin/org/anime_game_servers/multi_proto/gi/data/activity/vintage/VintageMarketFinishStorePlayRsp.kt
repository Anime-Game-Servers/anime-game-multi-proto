package org.anime_game_servers.multi_proto.gi.data.activity.vintage

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_3_1_0)
@ProtoCommand(RESPONSE)
internal interface VintageMarketFinishStorePlayRsp {
    var retcode: Retcode
    var displayReturnCoinB: Int
    var lowAttrStoreList: List<Int>
    var roundCoinBIncome: Int
    var roundDeltaCoinC: Int
    var roundTotalIncome: Int
    var storeIncomeMap: Map<Int, Int>
    var storeRound: Int
    var triggerEnvEventList: List<Int>
    var triggerNpcEventList: List<Int>
}
