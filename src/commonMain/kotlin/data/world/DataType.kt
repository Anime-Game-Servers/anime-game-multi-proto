package data.world

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB2)
@ProtoEnum("WorldDataNotify")
enum class DataType {
    @AltName("DATA_TYPE_NONE")
    DATA_NONE,
    @AltName("DATA_TYPE_WORLD_LEVEL")
    WORLD_LEVEL,
    @AddedIn(VERSION.V1_1_0)
    @AltName("DATA_TYPE_IS_IN_MP_MODE")
    IS_IN_MP_MODE,
}