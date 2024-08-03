package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@ProtoCommand(CommandType.RESPONSE)
interface ChangeGameTimeRsp {
    var extraDays: Int
    var curGameTime: Int
    var retCode: Int
}