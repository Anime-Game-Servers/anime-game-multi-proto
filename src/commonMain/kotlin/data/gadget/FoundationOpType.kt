package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_3_0)
@ProtoEnum
enum class FoundationOpType {
    FOUNDATION_OP_NONE,
    FOUNDATION_OP_BUILD,
    FOUNDATION_OP_DEMOLITION,
    FOUNDATION_OP_REBUILD,
    FOUNDATION_OP_ROTATE,
    FOUNDATION_OP_LOCK,
    FOUNDATION_OP_UNLOCK,
}