package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class MapMarkPointType {
    @AltName("MAP_MARK_POINT_TYPE_NPC")
    NPC,
    @AltName("MAP_MARK_POINT_TYPE_QUEST")
    QUEST,
    @AltName("MAP_MARK_POINT_TYPE_SPECIAL")
    SPECIAL,
    @AltName("MAP_MARK_POINT_TYPE_MINE")
    MINE,
    @AltName("MAP_MARK_POINT_TYPE_COLLECTION")
    COLLECTION,
    @AltName("MAP_MARK_POINT_TYPE_MONSTER")
    MONSTER,
    @AddedIn(GI_2_1_0)
    @AltName("MAP_MARK_POINT_TYPE_FISH_POOL")
    FISH_POOL,
}
