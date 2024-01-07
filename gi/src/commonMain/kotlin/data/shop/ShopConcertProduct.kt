package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_1_0)
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