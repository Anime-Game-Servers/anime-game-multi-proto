package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.exchange

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel(parentClass = "GetHomeExchangeWoodInfoRsp")
internal interface HomeExchangeWoodInfo {
    var exchangeLimit: Int
    var exchangedCount: Int
    var nextRefreshTime: Int
    var woodId: Int
}
