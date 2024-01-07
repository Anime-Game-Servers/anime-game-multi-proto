package data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE)
interface GetAllMailRsp {
    var mailList: List<MailData>
    var retCode: Int
    @AddedIn(Version.GI_1_5_0)
    var isTruncated: Boolean
    @AddedIn(Version.GI_2_4_0)
    var isCollected: Boolean
}