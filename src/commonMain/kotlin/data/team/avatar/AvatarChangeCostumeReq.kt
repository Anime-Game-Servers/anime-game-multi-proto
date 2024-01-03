package data.team.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface AvatarChangeCostumeReq {
    var avatarGuid: Long
    var costumeId: Int
}