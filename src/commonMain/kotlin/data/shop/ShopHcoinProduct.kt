package data.shop

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
@ProtoModel
interface ShopHcoinProduct {
    var productTier: String
    var priceTier: String
    var hcoinBase: Int
    var hcoinNonFirst: Int
    var hcoinFirst: Int
    var boughtNum: Int
}