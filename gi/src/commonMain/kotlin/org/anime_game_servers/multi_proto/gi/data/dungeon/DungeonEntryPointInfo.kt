package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_8_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DungeonEntryPointInfo {
    var sceneId: Int
    var pointId: Int
    var dungeonEntryList: List<DungeonEntryInfo>
    var recommendDungeonId: Int
}