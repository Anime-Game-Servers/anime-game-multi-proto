package org.anime_game_servers.multi_proto.gi.data.activity.treasure_map

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface TreasureMapBonusChallengeInfo {
    var configId: Int
    var isActive: Boolean
    var isDone: Boolean
    @AddedIn(GI_2_0_0)
    var fragmentMap: Map<Int, Boolean>
    @AddedIn(GI_2_0_0)
    var solutionId: Int
}