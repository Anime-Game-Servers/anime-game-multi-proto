package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
internal interface AvatarEquipAffixInfo {
    var equipAffixId: Int
    var leftCdTime: Int
}