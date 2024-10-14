package org.anime_game_servers.multi_proto.gi.data.serenitea_pot

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureSuiteData

@AddedIn(GI_1_6_0)
@RemovedIn(GI_2_1_0)
@ProtoModel
internal interface HomeScenePositionInfo {
    var deployNpcList: List<HomeNpcData>
    var furnitureSuiteList: List<HomeFurnitureSuiteData>
    var sceneId: Int
}
