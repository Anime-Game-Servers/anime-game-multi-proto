package data.team

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V3_0_0

@AddedIn(V3_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarTeamAllDataNotify {
    var avatarTeamMap: Map<Int, AvatarTeam>
    var tempAvatarGuidList: List<Long>
    var backupAvatarTeamOrderList: List<Int>
}
