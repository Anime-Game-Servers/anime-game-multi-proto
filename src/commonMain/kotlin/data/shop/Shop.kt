package data.shop

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface Shop {
    var shopType: Int
    var goodsList: List<ShopGoods>
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var hcoinProductList: List<ShopHcoinProduct>
    @AddedIn(VERSION.V1_0_0)
    var mcoinProductList: List<ShopMcoinProduct>
    @AddedIn(VERSION.V0_9_0)
    var cardProductList: List<ShopCardProduct>
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var package_poductList: List<ShopPackageProduct>
    @AddedIn(VERSION.V0_9_0)
    var nextRefreshTime: Int
    @AddedIn(VERSION.V1_1_0)
    var cityId: Int
    @AddedIn(VERSION.V1_1_0)
    var cityReputationLevel: Int
    @AddedIn(VERSION.V2_1_0)
    var concertProductList: List<ShopConcertProduct>
}