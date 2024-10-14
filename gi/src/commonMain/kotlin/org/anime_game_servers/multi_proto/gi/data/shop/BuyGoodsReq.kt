package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface BuyGoodsReq {
    var buyCount: Int
    var goods: ShopGoods
    var shopType: Int
}