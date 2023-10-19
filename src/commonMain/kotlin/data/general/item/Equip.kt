package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface Equip {
    @OneOf(Reliquary::class, Weapon::class)
    var detail: OneOfType
    @AddedIn(VERSION.V1_1_0)
    var isLocked: Boolean
}