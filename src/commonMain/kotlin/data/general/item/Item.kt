package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
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