package org.anime_game_servers.multi_proto.gi.data.activity.sumo

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface SumoStageData {
    var isOpen: Boolean
    var maxScore: Int
    var openTime: Int
    var stageId: Int
    var teamList: List<SumoTeamData>
}
