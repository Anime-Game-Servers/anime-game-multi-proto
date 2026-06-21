package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT

@AddedIn(GI_1_5_0)
@ProtoCommand(CLIENT)
internal interface ChangeMailStarNotify {
    var isStar: Boolean
    var mailIdList: List<Int>
}
