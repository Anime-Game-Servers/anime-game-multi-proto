package data.general.Item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface Item {
    var itemId: Int
    var guid: Long
    @OneOf(Material::class, Equip::class)
    var detail: OneOfType
}