package data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_3_0_0)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY)
interface GetAllMailResultNotify {
    var mailList: List<MailData>
    var transaction: String
    var totalPageCount: Int
    var pageIndex: Int
    var isCollected: Boolean
    var retCode: Int
}