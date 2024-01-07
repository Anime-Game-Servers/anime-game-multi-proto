package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
enum class InterOpType {
    @AltName("INTER_OP_TYPE_FINISH")
    INTER_OP_FINISH,
    @AltName("INTER_OP_TYPE_START")
    INTER_OP_START
}