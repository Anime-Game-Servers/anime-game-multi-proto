package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V0_9_0)
@ProtoEnum
enum class FriendOnlineState {
    @AltName("FREIEND_DISCONNECT","FREIEND_ONLINE_STATE_DISCONNECT","FRIEND_ONLINE_STATE_DISCONNECT")
    FRIEND_DISCONNECT,
    @AltName("FRIEND_ONLINE_STATE_ONLINE")
    FRIEND_ONLINE,
}