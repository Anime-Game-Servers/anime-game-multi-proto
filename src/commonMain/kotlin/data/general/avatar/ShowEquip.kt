package data.general.avatar

import annotations.AddedIn
import data.general.item.Reliquary
import data.general.item.Weapon
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
internal interface ShowEquip {
    var itemId: Int
    @OneOf(
        types = [
            OneOfEntry(Reliquary::class, "reliquary"),
            OneOfEntry(Weapon::class, "weapon"),
        ]
    )
    var detail: OneOfType
}