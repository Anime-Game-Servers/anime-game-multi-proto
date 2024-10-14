package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_2_0)
@ProtoEnum
internal enum class RogueCellState {
    @AltName("ROGUE_CELL_STATE_NONE")
    ROGUE_CELL_NONE,
    @AltName("ROGUE_CELL_STATE_BATTLE")
    ROGUE_CELL_BATTLE,
    @AltName("ROGUE_CELL_STATE_SUCCESS")
    ROGUE_CELL_SUCCESS,
    @AltName("ROGUE_CELL_STATE_FINISH")
    ROGUE_CELL_FINISH,
    @AltName("ROGUE_CELL_STATE_TAKEN_CHEST")
    ROGUE_CELL_TAKEN_CHEST,
}
