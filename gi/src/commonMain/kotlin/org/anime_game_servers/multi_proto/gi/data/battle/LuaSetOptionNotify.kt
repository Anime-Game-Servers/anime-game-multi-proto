package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_3_0)
@ProtoCommand(NOTIFY)
internal interface LuaSetOptionNotify {
    var luaSetParam: String
    var optionType: org.anime_game_servers.multi_proto.gi.data.battle.LuaOptionType
}
