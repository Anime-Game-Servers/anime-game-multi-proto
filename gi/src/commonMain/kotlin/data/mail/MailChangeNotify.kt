package data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY)
interface MailChangeNotify {
    var mailList: List<MailData>
    var delMailIdList: List<Int>
}