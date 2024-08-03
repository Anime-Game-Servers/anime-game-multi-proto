package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_3_4_0)
@ProtoCommand(CommandType.REQUEST)
interface SkipPlayerGameTimeReq {
    var isForceSet: Boolean
    var clientGameTime: Int
    var gameTime: Int
}