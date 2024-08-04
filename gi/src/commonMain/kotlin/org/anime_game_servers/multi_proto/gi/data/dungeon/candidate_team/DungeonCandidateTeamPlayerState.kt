package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_6_0)
@ProtoEnum
internal enum class DungeonCandidateTeamPlayerState {
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE,
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR,
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY,
}
