package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.EquipParam
import org.anime_game_servers.multi_proto.gi.data.general.item.MaterialDeleteInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface MailItem {
    var equipParam: org.anime_game_servers.multi_proto.gi.data.general.item.EquipParam
    var deleteInfo: org.anime_game_servers.multi_proto.gi.data.general.item.MaterialDeleteInfo
}