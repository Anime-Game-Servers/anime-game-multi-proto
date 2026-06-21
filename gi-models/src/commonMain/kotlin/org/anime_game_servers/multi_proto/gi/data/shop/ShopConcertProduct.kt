package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface ShopConcertProduct {
    var productTier: String
    var priceTier: String
    var obtainCount: Int
    var obtainLimit: Int
    var beginTime: Int
    var endTime: Int
    var buyTimes: Int
}