package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface PlayerEnterDungeonReq {
    var dungeonId: Int
    var pointId: Int
    @AddedIn(GI_2_8_0)
    var enterPosInfo: DungeonEnterPosInfo
}