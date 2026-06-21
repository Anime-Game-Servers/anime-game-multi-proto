package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.shop.ShopCardProduct
import org.anime_game_servers.multi_proto.gi.data.shop.ShopConcertProduct
import org.anime_game_servers.multi_proto.gi.data.shop.ShopHcoinProduct
import org.anime_game_servers.multi_proto.gi.data.shop.ShopMcoinProduct

@AddedIn(GI_0_9_0)
@ProtoCommand(REQUEST)
internal interface RechargeReq {
    var cardProduct: ShopCardProduct
    @RemovedIn(GI_1_0_0)
    var hcoinProduct: ShopHcoinProduct
    var playProduct: PlayProduct
    @AddedIn(GI_1_0_0)
    var mcoinProduct: ShopMcoinProduct
    @AddedIn(GI_2_1_0)
    var concertProduct: ShopConcertProduct
}
