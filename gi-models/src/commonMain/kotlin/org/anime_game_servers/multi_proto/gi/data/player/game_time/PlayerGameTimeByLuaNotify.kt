package org.anime_game_servers.multi_proto.gi.data.player.game_time

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_4_0)
@ProtoCommand(NOTIFY)
internal interface PlayerGameTimeByLuaNotify {
    var gameTime: Int
    var simSpeed: Int
    var uid: Int
}