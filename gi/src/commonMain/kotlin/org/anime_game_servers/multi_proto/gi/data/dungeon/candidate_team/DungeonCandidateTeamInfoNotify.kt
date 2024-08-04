package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface DungeonCandidateTeamInfoNotify {
    var avatarList: List<DungeonCandidateTeamAvatar>
    var dungeonId: Int
    var readyPlayerUid: List<Int>
    @AddedIn(GI_1_3_0)
    var matchType: Int
    @AddedIn(GI_1_6_0)
    var playerStateMap: Map<Int, DungeonCandidateTeamPlayerState>
}
