package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_2_0)
@ProtoEnum("DataResVersionNotify")
internal enum class DataResVersionOpType {
    @AltName("DATA_RES_VERSION_OP_TYPE_NONE")
    OP_TYPE_NONE,
    @AltName("DATA_RES_VERSION_OP_TYPE_RELOGIN")
    OP_TYPE_RELOGIN,
    @AltName("DATA_RES_VERSION_OP_TYPE_MP_RELOGIN")
    OP_TYPE_MP_RELOGIN,
}