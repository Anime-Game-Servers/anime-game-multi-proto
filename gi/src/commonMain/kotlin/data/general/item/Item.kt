package data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface Item {
    var itemId: Int
    var guid: Long
    @OneOf(
        OneOfEntry(Material::class, "material"),
        OneOfEntry(Equip::class, "equip"),
        OneOfEntry(Furniture::class, "furniture")
    )
    var detail: OneOfType
}