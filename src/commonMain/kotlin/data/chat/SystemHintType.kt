package data.chat

import annotations.AddedIn
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V2_4_0)
@ProtoEnum
enum class SystemHintType {
    @AltName("SYSTEM_HINT_TYPE_CHAT_NONE")
    CHAT_NONE,
    @AltName("SYSTEM_HINT_TYPE_CHAT_ENTER_WORLD")
    CHAT_ENTER_WORLD,
    @AltName("SYSTEM_HINT_TYPE_CHAT_LEAVE_WORLD")
    CHAT_LEAVE_WORLD
}