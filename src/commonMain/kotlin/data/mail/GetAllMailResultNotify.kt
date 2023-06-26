package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(messages.VERSION.V3_0_0)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.NOTIFY)
interface GetAllMailResultNotify {
    var mailList: List<MailItem>
    var transaction: String
    var totalPageCount: Int
    var pageIndex: Int
    var isCollected: Boolean
    var retCode: Int
}