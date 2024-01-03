package data.team

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
internal interface AvatarTeam {
    var avatarGuidList: List<Long>
    var teamName: String
}