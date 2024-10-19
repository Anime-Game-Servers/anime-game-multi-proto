package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum(alternativeNames = ["DungeonCandidateTeamPlayerDismissReason"])
internal enum class DungeonCandidateTeamDismissReason {
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL")
    DUNGEON_CANDIDATE_TPDR_NORMAL,
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE")
    DUNGEON_CANDIDATE_TPDR_DIE,
    @AddedIn(GI_2_1_0)
    @AltName("DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT")
    DUNGEON_CANDIDATE_TPDR_DISCONNECT,
}
