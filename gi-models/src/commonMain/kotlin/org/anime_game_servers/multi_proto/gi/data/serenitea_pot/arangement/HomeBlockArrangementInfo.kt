package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureSuiteData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.HomeNpcData
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.shop.WeekendDjinnInfo

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeBlockArrangementInfo {
    var blockId: Int
    var comfortValue: Int
    var deployAnimalList: List<HomeAnimalData>
    @AltName("deployFurniureList")
    var deployFurnitureList: List<HomeFurnitureData>
    var deployNpcList: List<HomeNpcData>
    var dotPatternList: List<HomeBlockDotPattern>
    var furnitureSuiteList: List<HomeFurnitureSuiteData>
    var isUnlocked: Boolean
    var persistentFurnitureList: List<HomeFurnitureData>
    var weekendDjinnInfoList: List<WeekendDjinnInfo>
    @AddedIn(GI_2_0_0)
    var fieldList: List<HomeBlockFieldData>
    @AddedIn(GI_2_3_0)
    var furnitureGroupList: List<HomeFurnitureGroupData>
    @AddedIn(GI_2_4_0)
    var furnitureCustomSuiteList: List<HomeFurnitureCustomSuiteData>
}
