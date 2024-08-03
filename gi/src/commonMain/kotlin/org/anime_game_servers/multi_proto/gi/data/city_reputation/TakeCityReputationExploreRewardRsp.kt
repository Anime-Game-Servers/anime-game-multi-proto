package org.anime_game_servers.multi_proto.gi.data.city_reputation

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface TakeCityReputationExploreRewardRsp {
    var cityId: Int
    var exploreIdList: List<Int>
    var itemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var retCode: Int
}
