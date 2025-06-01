package org.anime_game_servers.multi_proto.gi.data.other.code_exec

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface PlayerLuaShellNotify {
    var id: Int
    var luaShell: ByteArray
    @AddedIn(GI_1_3_0)
    var useType: Int
    @AddedIn(GI_2_5_0)
    var shellType: LuaShellType
}
