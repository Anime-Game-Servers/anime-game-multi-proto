package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.custom

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(NOTIFY)
internal interface HomeCustomFurnitureInfoNotify {
    var customFurnitureInfoList: List<HomeCustomFurnitureInfo>
    var deleteCustomFurnitureList: List<Int>
    var usedSubFurnitureCountMap: Map<Int, Int>
}