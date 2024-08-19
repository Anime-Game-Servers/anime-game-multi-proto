package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface GetAllMailRsp {
    var mailList: List<MailData>
    var retCode: Int
    @AddedIn(GI_1_5_0)
    var isTruncated: Boolean
    @AddedIn(GI_2_4_0)
    var isCollected: Boolean
}
