package org.anime_game_servers.multi_proto.gi.data.activity.arena_challenge

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface ArenaChallengeActivityDetailInfo {
    var levelList: List<ArenaChallengeMonsterLevel>
    var levelOpenTimeMap: Map<Int, Int>
    var worldLevel: Int
    @AddedIn(GI_2_8_0)
    var isFinishAnyLevel: Boolean
}
