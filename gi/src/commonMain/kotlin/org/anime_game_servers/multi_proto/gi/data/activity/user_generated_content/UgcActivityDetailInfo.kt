package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.dungeon.OfficialCustomDungeon
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface UgcActivityDetailInfo {
    var customDungeonGroupId: Int
    var isEnableUgc: Boolean
    var officialCustomDungeonList: List<OfficialCustomDungeon>
    @AddedIn(GI_2_6_0)
    var isUgcFeaturesClosed: Boolean
}