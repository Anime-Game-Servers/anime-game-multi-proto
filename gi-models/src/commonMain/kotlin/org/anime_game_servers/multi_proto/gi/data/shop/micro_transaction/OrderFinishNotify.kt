package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface OrderFinishNotify {
    @RemovedIn(GI_1_0_0)
    var addHcoin: Int
    var productId: String
    @AddedIn(GI_1_0_0)
    var addMcoin: Int
    @AddedIn(GI_1_0_0)
    var cardProductRemainDays: Int
    @AddedIn(GI_1_0_0)
    var orderId: Int
    @AddedIn(GI_1_2_0)
    var itemList: List<ItemParam>
}
