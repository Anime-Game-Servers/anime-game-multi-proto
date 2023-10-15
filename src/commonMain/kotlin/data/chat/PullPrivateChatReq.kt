package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.REQUEST)
interface PullPrivateChatReq {
    var targetUid: Int
    var pullNum: Int
    var fromSequence: Int
}