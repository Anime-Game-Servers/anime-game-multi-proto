package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_3_0)
@ProtoEnum
enum class FoundationOpType {
    @AltName("FOUNDATION_OP_TYPE_NONE")
    FOUNDATION_OP_NONE,
    @AltName("FOUNDATION_OP_TYPE_BUILD")
    FOUNDATION_OP_BUILD,
    @AltName("FOUNDATION_OP_TYPE_DEMOLITION")
    FOUNDATION_OP_DEMOLITION,
    @AltName("FOUNDATION_OP_TYPE_REBUILD")
    FOUNDATION_OP_REBUILD,
    @AltName("FOUNDATION_OP_TYPE_ROTATE")
    FOUNDATION_OP_ROTATE,
    @AltName("FOUNDATION_OP_TYPE_LOCK")
    FOUNDATION_OP_LOCK,
    @AltName("FOUNDATION_OP_TYPE_UNLOCK")
    FOUNDATION_OP_UNLOCK,
}