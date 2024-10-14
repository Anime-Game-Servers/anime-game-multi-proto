package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_3_0_0)
@ProtoCommand(NOTIFY)
internal interface GetAllMailResultNotify {
    var retCode: Retcode
    var isCollected: Boolean
    var mailList: List<MailData>
    var pageIndex: Int
    var totalPageCount: Int
    var transaction: String
}
