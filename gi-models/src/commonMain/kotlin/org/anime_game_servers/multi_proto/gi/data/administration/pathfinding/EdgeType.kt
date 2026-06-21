package org.anime_game_servers.multi_proto.gi.data.administration.pathfinding

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum("PBNavMeshPoly")
internal enum class EdgeType {
    @AltName("EDGE_TYPE_INNER")
    INNER,
    @AltName("EDGE_TYPE_TILE_BOUND")
    TILE_BOUND,
    @AltName("EDGE_TYPE_TILE_BOUND_UNCONNECT")
    TILE_BOUND_UNCONNECT,
    @AddedIn(GI_2_6_0)
    @AltName("EDGE_TYPE_TILE_BOUND_OVERIDE")
    TILE_BOUND_OVERIDE,

}

