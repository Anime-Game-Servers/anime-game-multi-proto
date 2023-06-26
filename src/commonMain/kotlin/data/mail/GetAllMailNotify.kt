package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(messages.VERSION.V3_0_0)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.CLIENT)
interface GetAllMailNotify {
    var isCollected : Boolean
}