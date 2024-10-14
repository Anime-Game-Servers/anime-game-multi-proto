package org.anime_game_servers.multi_proto.gi.data.world

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB2)
@ProtoEnum("WorldDataNotify")
enum class DataType {
    @AltName("DATA_TYPE_NONE")
    DATA_NONE,
    @AltName("DATA_TYPE_WORLD_LEVEL")
    WORLD_LEVEL,
    @AddedIn(Version.GI_1_1_0)
    @AltName("DATA_TYPE_IS_IN_MP_MODE")
    IS_IN_MP_MODE,
}