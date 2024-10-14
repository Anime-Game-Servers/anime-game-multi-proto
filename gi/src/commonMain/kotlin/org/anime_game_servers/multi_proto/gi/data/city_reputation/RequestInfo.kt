package org.anime_game_servers.multi_proto.gi.data.city_reputation

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel(parentClass = "CityReputationRequestInfo")
internal interface RequestInfo {
    var isTakenReward: Boolean
    var questId: Int
    var requestId: Int
}
