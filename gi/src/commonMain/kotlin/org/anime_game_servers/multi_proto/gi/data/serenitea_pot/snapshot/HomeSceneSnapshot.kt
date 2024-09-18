package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.snapshot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureSuiteData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.HomeNpcData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.scene.HomeTransferData

@AddedIn(GI_1_5_0)
@RemovedIn(GI_2_1_0)
@ProtoModel
internal interface HomeSceneSnapshot {
    var deployNpcList: List<HomeNpcData>
    var djinnPos: Vector
    var furnitureSuiteList: List<HomeFurnitureSuiteData>
    var mainHouse: HomeFurnitureData
    var sceneId: Int
    @AddedIn(GI_2_0_0)
    var transferList: List<HomeTransferData>
}
