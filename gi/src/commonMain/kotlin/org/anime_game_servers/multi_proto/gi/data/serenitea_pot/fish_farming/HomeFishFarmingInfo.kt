package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.fish_farming

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface HomeFishFarmingInfo {
    var fishIdList: List<Int>
    var fishpondGuid: Int
}
