package org.anime_game_servers.multi_proto.gi.data.activity.roguelike_dungeon

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_2_0)
@ProtoEnum
internal enum class RogueEliteCellDifficultyType {
    @AltName("ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL")
    ROGUE_ELITE_NORMAL,
    @AltName("ROGUE_ELITE_CELL_DIFFICULTY_TYPE_HARD")
    ROGUE_ELITE_HARD,
}
