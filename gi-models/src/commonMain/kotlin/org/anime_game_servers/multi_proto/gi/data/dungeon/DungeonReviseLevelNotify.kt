package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(CLIENT)
internal interface DungeonReviseLevelNotify {
    var dungeonId: Int
    var reviseLevel: Int
    @AddedIn(GI_2_4_0)
    var sceneLevel: Int
}
