package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.dungeon.OfficialCustomDungeon
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_7_0)
@ProtoModel
interface UgcActivityDetailInfo {
    var isUgcFeaturesClosed: Boolean
    var customDungeonGroupId: Int
    var isEnableUgc: Boolean
    var officialCustomDungeonList: List<OfficialCustomDungeon>
}