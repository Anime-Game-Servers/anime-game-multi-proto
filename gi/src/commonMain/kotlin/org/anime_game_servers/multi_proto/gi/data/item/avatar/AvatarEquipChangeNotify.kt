package org.anime_game_servers.multi_proto.gi.data.item.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.entity.SceneReliquaryInfo
import org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarEquipChangeNotify {
    var avatarGuid: Long
    var equipGuid: Long
    var equipType: Int
    var itemId: Int
    var weapon: org.anime_game_servers.multi_proto.gi.data.general.entity.SceneWeaponInfo
    var reliquary: org.anime_game_servers.multi_proto.gi.data.general.entity.SceneReliquaryInfo
}
