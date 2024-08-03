package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_5_0)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT)
interface ChangeMailStarNotify {
    var isStar: Boolean
    var mailIdList: List<Int>
}