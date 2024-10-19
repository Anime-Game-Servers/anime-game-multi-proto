package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class DungeonCandidateTeamPlayerLeaveReason {
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL")
    DUNGEON_CANDIDATE_TPLR_NORMAL,
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE")
    DUNGEON_CANDIDATE_TPLR_DIE,
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK")
    DUNGEON_CANDIDATE_TPLR_BE_KICK,
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_DISCONNECT")
    DUNGEON_CANDIDATE_DISCONNECT,
}
