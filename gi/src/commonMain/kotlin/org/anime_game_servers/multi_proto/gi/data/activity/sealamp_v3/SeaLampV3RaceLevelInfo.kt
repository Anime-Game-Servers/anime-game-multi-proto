package org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_4_0)
@ProtoModel
internal interface SeaLampV3RaceLevelInfo {
    var isOpen: Boolean
    var levelId: Int
    var maxScore: Int
}
