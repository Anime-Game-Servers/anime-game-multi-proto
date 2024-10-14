package org.anime_game_servers.multi_proto.gi.data.activity.aster

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
interface AsterMidDetailInfo {
    var beginTime: Int
    var campList: List<AsterMidCampInfo>
    var collectCount: Int
    var isOpen: Boolean
}