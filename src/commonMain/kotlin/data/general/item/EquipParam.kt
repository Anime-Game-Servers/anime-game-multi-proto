package data.general.item

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface EquipParam {
    var itemId: Int
    var itemNum: Int
    var itemLevel: Int
    var promoteLevel: Int
}