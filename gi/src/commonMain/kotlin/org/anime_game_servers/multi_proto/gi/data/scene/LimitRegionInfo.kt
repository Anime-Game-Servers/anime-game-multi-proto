package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.GI_4_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_4_8_0)
@ProtoModel
internal interface LimitRegionInfo {
    var limitRegionList: List<Int>
}
