package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface Shop {
    var shopType: Int
    var goodsList: List<ShopGoods>
    @AddedIn(GI_0_9_0) @RemovedIn(GI_1_0_0)
    var hcoinProductList: List<ShopHcoinProduct>
    @AddedIn(GI_1_0_0)
    var mcoinProductList: List<ShopMcoinProduct>
    @AddedIn(GI_0_9_0)
    var cardProductList: List<ShopCardProduct>
    @AddedIn(GI_0_9_0) @RemovedIn(GI_1_0_0)
    @AltName("package_poductList")
    var packageProductList: List<ShopPackageProduct>
    @AddedIn(GI_0_9_0)
    var nextRefreshTime: Int
    @AddedIn(GI_1_1_0)
    var cityId: Int
    @AddedIn(GI_1_1_0)
    var cityReputationLevel: Int
    @AddedIn(GI_2_1_0)
    var concertProductList: List<ShopConcertProduct>
}