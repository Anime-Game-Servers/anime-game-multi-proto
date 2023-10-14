package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
interface ShopMcoinProduct {
    var productTier: String
    var priceTier: String
    var mcoinBase: Int
    var mcoinNonFirst: Int
    var mcoinFirst: Int
    var boughtNum: Int
    var isAudit: Boolean
}