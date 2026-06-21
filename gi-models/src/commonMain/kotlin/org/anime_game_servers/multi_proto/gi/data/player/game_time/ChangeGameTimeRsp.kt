package org.anime_game_servers.multi_proto.gi.data.player.game_time

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@ProtoCommand(RESPONSE)
internal interface ChangeGameTimeRsp {
    var retCode: Retcode
    @AddedIn(GI_2_2_0)
    var extraDays: Int
    var curGameTime: Int
}