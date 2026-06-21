package org.anime_game_servers.multi_proto.gi.data.dungeon.custom

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.community.player_presentation.SocialDetail

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface OtherCustomDungeonBrief {
    var abstract: CustomDungeonAbstract
    var battleMinCostTime: Int
    var creatorDetail: SocialDetail
    var dungeonGuid: Long
    var dungeonId: Int
    var isAdventureDungeon: Boolean
    var isStored: Boolean
    var setting: CustomDungeonSetting
    var social: CustomDungeonSocial
    var tagList: List<Int>
    @AddedIn(GI_2_6_0)
    var isPsnPlatform: Boolean
}
