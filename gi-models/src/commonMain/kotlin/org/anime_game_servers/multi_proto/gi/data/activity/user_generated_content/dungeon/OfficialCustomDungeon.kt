package org.anime_game_servers.multi_proto.gi.data.activity.user_generated_content.dungeon

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface OfficialCustomDungeon {
    var dungeonId: Int
    var winTimes: Int
}
