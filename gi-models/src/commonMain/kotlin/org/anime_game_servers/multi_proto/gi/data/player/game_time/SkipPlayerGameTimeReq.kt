package org.anime_game_servers.multi_proto.gi.data.player.game_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_5_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_5_0)
@ProtoCommand(REQUEST)
interface SkipPlayerGameTimeReq {
    var isForceSet: Boolean
    var clientGameTime: Int
    var gameTime: Int
}