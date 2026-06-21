package org.anime_game_servers.multi_proto.gi.data.activity.fish_blaster

import org.anime_game_servers.core.base.Version.GI_4_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_4_1_0)
@ProtoModel
internal interface FishBlasterInfo {
    var levelInfoList: List<FishBlasterLevelInfo>
}
