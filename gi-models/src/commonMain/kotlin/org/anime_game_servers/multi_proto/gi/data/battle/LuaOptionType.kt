package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_3_0)
@ProtoEnum("LuaSetOptionNotify")
internal enum class LuaOptionType {
    @AltName("LUA_OPTION_TYPE_NONE")
    LUA_OPTION_NONE,
    @AltName("LUA_OPTION_TYPE_PLAYER_INPUT")
    LUA_OPTION_PLAYER_INPUT,
}
