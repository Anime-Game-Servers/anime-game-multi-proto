package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface RogueCellInfo {
    var cellConfigId: Int
    var cellId: Int
    var cellType: Int
    var dungeonId: Int
    var state: org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon.RogueCellState
}
