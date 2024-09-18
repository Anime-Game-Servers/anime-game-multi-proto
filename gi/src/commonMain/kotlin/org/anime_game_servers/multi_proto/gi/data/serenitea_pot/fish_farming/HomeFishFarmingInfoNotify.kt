package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.fish_farming

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface HomeFishFarmingInfoNotify {
    var fishFarmingInfoList: List<HomeFishFarmingInfo>
}
