package data.general.item

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface EquipParamList {
    var itemList: List<EquipParam>
}