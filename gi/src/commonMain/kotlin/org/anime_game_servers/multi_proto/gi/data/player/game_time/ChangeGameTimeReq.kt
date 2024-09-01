package org.anime_game_servers.multi_proto.gi.data.player.game_time

import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@ProtoCommand(CommandType.REQUEST)
interface ChangeGameTimeReq {
    var extraDays: Int
    var gameTime: Int
    var isForceSet: Boolean
}