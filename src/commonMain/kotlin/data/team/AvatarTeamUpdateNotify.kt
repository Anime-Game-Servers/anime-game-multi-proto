package data.team

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V3_0_0
import messages.VERSION.VCB2

@AddedIn(VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarTeamUpdateNotify {
    var avatarTeamMap: Map<Int, AvatarTeam>
    var tempAvatarGuidList: List<Long>
}
