package data.chat

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.V1_2_0)
@ProtoCommand(CommandType.NOTIFY)
interface PrivateChatNotify {
    var chatInfo: ChatInfo
}