package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.NOTIFY)
interface ClientNewMailNotify {
    var notReadNum: Int
    var notGotAttachmentNum: Int
}