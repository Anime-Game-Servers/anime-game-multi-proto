package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface MailChangeNotify {
    var delMailIdList: List<Int>
    var mailList: List<MailData>
}
