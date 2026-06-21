package org.anime_game_servers.multi_proto.gi.data.shop.micro_transaction

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface PlayProduct {
    var priceTier: String
    var productId: String
    var scheduleId: Int
}
