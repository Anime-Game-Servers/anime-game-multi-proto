package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

import org.anime_game_servers.core.base.Version.GI_2_8_0

@AddedIn(GI_2_8_0)
@ProtoEnum
enum class IslandPartySailStage {
    ISLAND_PARTY_SAIL_STAGE_NONE,
    ISLAND_PARTY_SAIL_STAGE_SAIL,
    ISLAND_PARTY_SAIL_STAGE_BATTLE,
}