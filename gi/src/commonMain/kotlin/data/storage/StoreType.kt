package data.storage

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
@ProtoEnum
internal enum class StoreType {
    @AltName("STORE_TYPE_NONE")
    STORE_NONE,
    @AltName("STORE_TYPE_PACK")
    STORE_PACK,
    @AltName("STORE_TYPE_DEPOT")
    STORE_DEPOT,
}
