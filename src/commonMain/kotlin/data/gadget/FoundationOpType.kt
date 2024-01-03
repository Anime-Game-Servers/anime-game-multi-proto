package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_3_0)
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