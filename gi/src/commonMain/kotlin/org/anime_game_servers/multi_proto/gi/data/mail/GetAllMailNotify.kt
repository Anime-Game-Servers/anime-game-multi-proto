package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT


@AddedIn(GI_3_0_0)
@ProtoCommand(CLIENT)
internal interface GetAllMailNotify {
    var isCollected : Boolean
}
