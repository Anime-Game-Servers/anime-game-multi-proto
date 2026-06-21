package org.anime_game_servers.multi_proto.gi.data.activity.arena_challenge

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(NOTIFY)
internal interface ArenaChallengeFinishNotify {
    var arenaChallengeId: Int
    var arenaChallengeLevel: Int
    var childChallengeList: List<ArenaChallengeChildChallengeInfo>
    var isSuccess: Boolean
}
