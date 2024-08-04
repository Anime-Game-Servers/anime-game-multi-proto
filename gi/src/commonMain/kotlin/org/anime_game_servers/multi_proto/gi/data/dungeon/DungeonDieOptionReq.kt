package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface DungeonDieOptionReq {
    var dieOption: PlayerDieOption
    @AddedIn(GI_1_5_0)
    var isQuitImmediately: Boolean
}
