package data.team.avatar

import data.team.AvatarTeam
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface SetUpAvatarTeamReq {
    @AddedIn(GI_CB1)
    @RemovedIn(GI_CB2)
    var avatarTeam: AvatarTeam
    var avatarTeamGuidList: List<Long>
    var curAvatarGuid: Long
    var teamId: Int
}
