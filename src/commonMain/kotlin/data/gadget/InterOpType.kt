package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
enum class InterOpType {
    @AltName("INTER_OP_TYPE_FINISH")
    INTER_OP_FINISH,
    @AltName("INTER_OP_TYPE_START")
    INTER_OP_START
}