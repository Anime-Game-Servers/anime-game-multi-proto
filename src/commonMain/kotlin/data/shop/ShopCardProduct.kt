package data.shop

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface ShopCardProduct {
    var productTier: String
    var priceTier: String
    @RemovedIn(VERSION.V1_0_0)
    var hcoinBase: Int
    @AddedIn(VERSION.V1_0_0)
    var mcoinBase: Int
    var hcoinPerDay: Int
    var days: Int
    var remainRewardDays: Int
    @AddedIn(VERSION.V1_2_0)
    var cardProductType: Int
    @AddedIn(VERSION.V1_2_0)
    @OneOf(ResinCard::class)
    var extraCardData: OneOfType
}