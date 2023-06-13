package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
enum class InterOpType {
    INTER_OP_FINISH,
    INTER_OP_START
}