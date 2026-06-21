package org.anime_game_servers.multi_proto.gi.data.dungeon.candidate_team

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface DungeonCandidateTeamInviteRsp {
    var retcode: Retcode
    @AddedIn(GI_2_3_0)
    var invalidPlayerUids: List<Int>
}
