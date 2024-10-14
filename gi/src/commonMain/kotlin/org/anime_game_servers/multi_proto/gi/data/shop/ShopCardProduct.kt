package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface ShopCardProduct {
    var productTier: String
    var priceTier: String
    @RemovedIn(GI_1_0_0)
    var hcoinBase: Int
    @AddedIn(GI_1_0_0)
    var mcoinBase: Int
    var hcoinPerDay: Int
    var days: Int
    var remainRewardDays: Int
    @AddedIn(GI_1_2_0)
    var cardProductType: Int
    @AddedIn(GI_1_2_0)
    @OneOf(OneOfEntry(ResinCard::class, "resin_card"))
    var extraCardData: OneOfType
}