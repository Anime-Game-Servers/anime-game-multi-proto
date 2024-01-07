package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
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