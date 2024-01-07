package data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.EquipParam
import data.general.item.MaterialDeleteInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface MailItem {
    var equipParam: EquipParam
    var deleteInfo: MaterialDeleteInfo
}