package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface Weapon {
    var level: Int
    var exp: Int
    var promoteLevel: Int
    var affixMap: Map<Int, Int>
}