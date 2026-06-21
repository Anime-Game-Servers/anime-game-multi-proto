package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_1_2_0)
@ProtoCommand(RESPONSE)
internal interface TakeResinCardDailyRewardRsp {
    var retcode: Retcode
    var itemVec: List<ItemParam>
    var productConfigId: Int
}
