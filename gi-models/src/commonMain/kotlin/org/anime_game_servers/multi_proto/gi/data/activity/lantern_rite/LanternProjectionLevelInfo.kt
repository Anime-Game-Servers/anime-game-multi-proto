package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface LanternProjectionLevelInfo {
    var id: Int
    var isCanStart: Boolean
    var isFinished: Boolean
    var isShowTips: Boolean
    var minFinishTime: Int
}
