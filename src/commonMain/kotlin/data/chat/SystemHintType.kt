package data.chat

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V2_4_0)
@ProtoEnum
enum class SystemHintType {
    CHAT_NONE,
    CHAT_ENTER_WORLD,
    CHAT_LEAVE_WORLD
}