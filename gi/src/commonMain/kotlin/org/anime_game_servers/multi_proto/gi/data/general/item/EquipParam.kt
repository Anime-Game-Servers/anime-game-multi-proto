package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface EquipParam {
    var itemId: Int
    var itemNum: Int
    var itemLevel: Int
    var promoteLevel: Int
}