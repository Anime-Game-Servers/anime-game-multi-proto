package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.REQUEST)
interface PrivateChatReq {
    var targetUid: Int
    @OneOf(String::class, Int::class)
    var content: OneOfType
}