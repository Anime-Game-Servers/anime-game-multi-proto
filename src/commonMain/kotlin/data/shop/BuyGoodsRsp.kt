package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface BuyGoodsRsp {
    var retcode: Int
    var shopType: Int
    var goods: ShopGoods
    var buyCount: Int
    @AddedIn(VERSION.V1_2_0)
    var goodsList: List<ShopGoods>
}