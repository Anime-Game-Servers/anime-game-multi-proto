package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureData

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeSceneArrangementInfo {
    var blockArrangementInfoList: List<HomeBlockArrangementInfo>
    var bornPos: Vector
    var bornRot: Vector
    var comfortValue: Int
    var djinnPos: Vector
    var doorList: List<HomeFurnitureData>
    var isSetBornPos: Boolean
    var mainHouse: HomeFurnitureData
    var sceneId: Int
    var stairList: List<HomeFurnitureData>
    var tmpVersion: Int
    @AddedIn(GI_2_4_0)
    var bgmId: Int
}
