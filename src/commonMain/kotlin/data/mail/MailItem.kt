package data.mail

import annotations.AddedIn
import data.general.Item.EquipParam
import data.general.Item.MaterialDeleteInfo
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V0_9_0)
@ProtoModel
interface MailItem {
    var equipParam: EquipParam
    var deleteInfo: MaterialDeleteInfo
}