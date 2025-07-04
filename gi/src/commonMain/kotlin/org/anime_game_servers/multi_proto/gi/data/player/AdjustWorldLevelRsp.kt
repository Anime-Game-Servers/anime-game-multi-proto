package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
internal interface AdjustWorldLevelRsp {
    var retcode: Retcode
    var afterWorldLevel: Int
    var cdOverTime: Int
}
