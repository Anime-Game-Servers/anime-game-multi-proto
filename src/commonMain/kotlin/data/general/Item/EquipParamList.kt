package data.general.Item

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface EquipParamList {
    var itemList: List<EquipParam>
}