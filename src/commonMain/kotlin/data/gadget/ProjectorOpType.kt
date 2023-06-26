package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V2_0_0)
@ProtoEnum
enum class ProjectorOpType {
    PROJECTOR_OP_NONE,
    PROJECTOR_OP_CREATE,
    PROJECTOR_OP_DESTROY
}