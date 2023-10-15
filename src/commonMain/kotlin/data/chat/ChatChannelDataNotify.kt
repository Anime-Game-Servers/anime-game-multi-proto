package data.chat

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.V1_5_0)
@ProtoCommand(CommandType.NOTIFY)
interface ChatChannelDataNotify {
    var channelList: List<Int>
}