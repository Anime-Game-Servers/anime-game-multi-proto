package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.Version.GI_5_0_0
import org.anime_game_servers.core.base.Version.GI_5_5_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class PlayerDieType {
    @AltName("PLAYER_DIE_TYPE_NONE")
    PLAYER_DIE_NONE,
    @AltName("PLAYER_DIE_TYPE_KILL_BY_MONSTER")
    PLAYER_DIE_KILL_BY_MONSTER,
    @AltName("PLAYER_DIE_TYPE_KILL_BY_GEAR")
    PLAYER_DIE_KILL_BY_GEAR,
    @AltName("PLAYER_DIE_TYPE_FALL")
    PLAYER_DIE_FALL,
    @AltName("PLAYER_DIE_TYPE_DRAWN")
    PLAYER_DIE_DRAWN,
    @AltName("PLAYER_DIE_TYPE_ABYSS")
    PLAYER_DIE_ABYSS,
    @AddedIn(GI_CB2)
    @AltName("PLAYER_DIE_TYPE_GM")
    PLAYER_DIE_GM,
    @AddedIn(GI_1_2_0)
    @AltName("PLAYER_DIE_TYPE_CLIMATE_COLD")
    PLAYER_DIE_CLIMATE_COLD,
    @AddedIn(GI_1_2_0)
    @AltName("PLAYER_DIE_TYPE_STORM_LIGHTING")
    PLAYER_DIE_STORM_LIGHTING,
    @AddedIn(GI_4_5_0) // TODO verify 4.1 to 4.4
    PLAYER_DIE_DIRTY_WATER_EROSION,
    @AddedIn(GI_5_0_0)
    PLAYER_DIE_LIQUID_PHLOGISTON,
    @AddedIn(GI_5_5_0)
    PLAYER_DIE_LEVEL_FORCE_DIE,
}
