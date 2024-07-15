package data.item

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_2_0)
@ProtoEnum
internal enum class MaterialDeleteReturnType {
    @AltName("MATERIAL_DELETE_RETURN_TYPE_BAG")
    MATERIAL_DELETE_RETURN_BAG,
    @AltName("MATERIAL_DELETE_RETURN_TYPE_SEED")
    MATERIAL_DELETE_RETURN_SEED,
}
