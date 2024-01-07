package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
@ProtoModel
interface ShopHcoinProduct {
    var productTier: String
    var priceTier: String
    var hcoinBase: Int
    var hcoinNonFirst: Int
    var hcoinFirst: Int
    var boughtNum: Int
}