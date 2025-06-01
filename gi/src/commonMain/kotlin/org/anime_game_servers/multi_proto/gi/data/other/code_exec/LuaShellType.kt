package org.anime_game_servers.multi_proto.gi.data.other.code_exec

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_5_0)
@ProtoEnum
internal enum class LuaShellType {
    @AltName("LUA_SHELL_TYPE_LUASHELL_NONE")
    LUASHELL_NONE,
    @AltName("LUA_SHELL_TYPE_LUASHELL_NORMAL")
    LUASHELL_NORMAL,
    @AltName("LUA_SHELL_TYPE_LUASHELL_SECURITY")
    LUASHELL_SECURITY,
    @AltName("LUA_SHELL_TYPE_LUASHELL_SHELL_CODE")
    LUASHELL_SHELL_CODE,
}
