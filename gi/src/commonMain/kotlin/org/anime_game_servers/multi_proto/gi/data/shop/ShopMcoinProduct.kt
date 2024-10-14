package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface ShopMcoinProduct {
    var productTier: String
    var priceTier: String
    var mcoinBase: Int
    var mcoinNonFirst: Int
    var mcoinFirst: Int
    var boughtNum: Int
    var isAudit: Boolean
}