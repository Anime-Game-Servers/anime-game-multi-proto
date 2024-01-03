package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface Equip {
    @OneOf(
        OneOfEntry(Reliquary::class, "reliquary"),
        OneOfEntry(Weapon::class, "weapon")
    )
    var detail: OneOfType
    @AddedIn(VERSION.V1_1_0)
    var isLocked: Boolean
}