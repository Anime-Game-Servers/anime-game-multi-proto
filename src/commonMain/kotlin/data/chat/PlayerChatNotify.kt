package data.chat

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
interface PlayerChatNotify {
    var chatInfo: ChatInfo
    var channelId: Int
}