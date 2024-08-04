package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface RoguelikeDungeonSettleInfo {
    var curLevel: Int
    var finishedChallengeCellNumMap: Map<Int, RoguelikeSettleCoinInfo>
    var isCoinCReachLimit: Boolean
    var isFinalLevel: Boolean
    var stageId: Int
    var totalCoinBNum: Int
    var totalCoinCNum: Int
}