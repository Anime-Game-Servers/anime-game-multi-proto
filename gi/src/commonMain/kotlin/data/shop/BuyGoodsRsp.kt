package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface BuyGoodsRsp {
    var retcode: Int
    var shopType: Int
    var goods: ShopGoods
    var buyCount: Int
    @AddedIn(Version.GI_1_2_0)
    var goodsList: List<ShopGoods>
}