package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface Material {
    var count: Int
    var deleteInfo: org.anime_game_servers.multi_proto.gi.data.general.item.MaterialDeleteInfo
}