package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface Shop {
    var shopType: Int
    var goodsList: List<ShopGoods>
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var hcoinProductList: List<ShopHcoinProduct>
    @AddedIn(Version.GI_1_0_0)
    var mcoinProductList: List<ShopMcoinProduct>
    @AddedIn(Version.GI_0_9_0)
    var cardProductList: List<ShopCardProduct>
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var package_poductList: List<ShopPackageProduct>
    @AddedIn(Version.GI_0_9_0)
    var nextRefreshTime: Int
    @AddedIn(Version.GI_1_1_0)
    var cityId: Int
    @AddedIn(Version.GI_1_1_0)
    var cityReputationLevel: Int
    @AddedIn(Version.GI_2_1_0)
    var concertProductList: List<ShopConcertProduct>
}