package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.EquipParam
import org.anime_game_servers.multi_proto.gi.data.general.item.MaterialDeleteInfo
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface MailItem {
    var deleteInfo: MaterialDeleteInfo
    var equipParam: EquipParam
}
