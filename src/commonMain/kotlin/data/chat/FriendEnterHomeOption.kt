package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_5_0)
@ProtoEnum
enum class FriendEnterHomeOption {
    FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM,
    FRIEND_ENTER_HOME_OPTION_REFUSE,
    FRIEND_ENTER_HOME_OPTION_DIRECT,
}