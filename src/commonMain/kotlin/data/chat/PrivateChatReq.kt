package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.*


@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.REQUEST)
interface PrivateChatReq {
    var targetUid: Int
    @OneOf(
        OneOfEntry(String::class, "text"),
        OneOfEntry(Int::class, "icon")
    )
    var content: OneOfType
}