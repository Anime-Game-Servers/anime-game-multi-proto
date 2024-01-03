package data.storage

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class StoreType {
    @AltName("STORE_TYPE_NONE")
    STORE_NONE,
    @AltName("STORE_TYPE_PACK")
    STORE_PACK,
    @AltName("STORE_TYPE_DEPOT")
    STORE_DEPOT,
}
