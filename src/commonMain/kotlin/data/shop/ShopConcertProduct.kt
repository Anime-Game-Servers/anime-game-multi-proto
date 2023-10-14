package data.shop

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_1_0)
@ProtoModel
interface ShopConcertProduct {
    var productTier: String
    var priceTier: String
    var obtainCount: Int
    var obtainLimit: Int
    var beginTime: Int
    var endTime: Int
    var buyTimes: Int
}