package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_2_0)
@ProtoEnum("UpdateAbilityCreatedMovingPlatformNotify")
enum class OpType {
    @AltName("OP_TYPE_NONE")
    OP_NONE,
    @AltName("OP_TYPE_ACTIVATE")
    OP_ACTIVATE,
    @AltName("OP_TYPE_DEACTIVATE")
    OP_DEACTIVATE
}