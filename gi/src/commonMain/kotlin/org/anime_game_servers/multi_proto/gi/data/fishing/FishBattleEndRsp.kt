package org.anime_game_servers.multi_proto.gi.data.fishing

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_2_1_0)
@ProtoCommand(RESPONSE)
internal interface FishBattleEndRsp {
    var retcode: Retcode
    var battleResult: FishBattleResult
    var isGotReward: Boolean
    var noRewardReason: FishNoRewardReason
    @AddedIn(GI_2_2_0)
    var dropItemList: List<ItemParam>
    @AddedIn(GI_2_2_0)
    var rewardItemList: List<ItemParam>
    @AddedIn(GI_2_2_0)
    var talentItemList: List<ItemParam>
}
