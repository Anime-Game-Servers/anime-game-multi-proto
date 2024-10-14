package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.run

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface TowerLevelStarCondData {
    var condValue: Int
    var isPause: Boolean
    var starCondIndex: Int
    @AddedIn(GI_2_4_0)
    var isFail: Boolean
}
