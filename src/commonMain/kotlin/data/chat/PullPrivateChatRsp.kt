package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.RESPONSE)
interface PullPrivateChatRsp {
    var chatInfo: ChatInfo
    var retCode: Int
}