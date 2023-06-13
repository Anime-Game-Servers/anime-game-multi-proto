package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_2_0)
@ProtoEnum
enum class OpType {
    OP_NONE,
    OP_ACTIVATE,
    OP_DEACTIVATE
}