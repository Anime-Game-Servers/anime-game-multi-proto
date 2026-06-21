package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface CustomDungeonBrief {
    var abstract: CustomDungeonAbstract
    var battleMinCostTime: Int
    var dungeonGuid: Long
    var dungeonId: Int
    var lastSaveTime: Int
    var setting: CustomDungeonSetting
    var social: CustomDungeonSocial
    var state: CustomDungeonState
    var tagList: List<Int>
    @AddedIn(GI_2_6_0)
    var isPsnPlatform: Boolean
}
