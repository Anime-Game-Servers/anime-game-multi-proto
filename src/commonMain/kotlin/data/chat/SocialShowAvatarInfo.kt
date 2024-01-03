package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.REQUEST)
interface SocialShowAvatarInfo {
    var avatarId: Int
    var level: Int
    @AddedIn(VERSION.V1_6_0)
    var costumeId: Int
}