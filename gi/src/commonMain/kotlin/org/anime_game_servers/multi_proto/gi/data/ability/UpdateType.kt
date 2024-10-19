package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum("ServerUpdateGlobalValueNotify")
internal enum class UpdateType {
    @AltName("INVALUE","UPDATE_TYPE_INVALID")
    INVALID,
    @AltName("UPDATE_TYPE_ADD")
    ADD,
    @AddedIn(GI_1_5_0)
    @AltName("UPDATE_TYPE_SET")
    SET,
}
