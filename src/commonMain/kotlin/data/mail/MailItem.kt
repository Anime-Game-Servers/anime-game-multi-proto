package data.mail

import data.general.Item.EquipParam
import data.general.Item.MaterialDeleteInfo
import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface MailItem {
    var equipParam: EquipParam
    var deleteInfo: MaterialDeleteInfo
}