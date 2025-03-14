package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.fish_farming

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_2_0)
@ProtoCommand(NOTIFY)
internal interface HomeScenePointFishFarmingInfoNotify {
    var fishFarmingInfoList: List<HomeScenePointFishFarmingInfo>
}
