package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.V1_5_0)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.CLIENT)
interface ChangeMailStarNotify {
    var isStar: Boolean
    var mailIdList: List<Int>
}