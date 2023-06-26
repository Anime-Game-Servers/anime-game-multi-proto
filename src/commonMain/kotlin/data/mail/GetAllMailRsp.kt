package data.mail

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.RESPONSE)
interface GetAllMailRsp {
    var mailList: List<MailData>
    var retCode: Int
    @AddedIn(VERSION.V1_5_0)
    var isTruncated: Boolean
    @AddedIn(VERSION.V2_4_0)
    var isCollected: Boolean
}