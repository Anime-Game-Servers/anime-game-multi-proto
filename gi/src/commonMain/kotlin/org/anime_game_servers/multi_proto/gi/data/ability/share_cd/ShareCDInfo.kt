package org.anime_game_servers.multi_proto.gi.data.ability.share_cd

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface ShareCDInfo {
    var cdStartTime: Long
    var index: Int
    var shareCdId: Int
}
