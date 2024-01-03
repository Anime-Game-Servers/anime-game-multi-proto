package data.team.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface AvatarChangeCostumeRsp {
    var costumeId: Int
    var avatarGuid: Long
    var retcode: Int
}