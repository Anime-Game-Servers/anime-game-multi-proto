package org.anime_game_servers.multi_proto.gi.data.activity.sumo

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_1_0)
@ProtoCommand(REQUEST)
internal interface SumoSaveTeamReq {
    var activityId: Int
    var difficultyId: Int
    var stageId: Int
    var teamList: List<SumoTeamData>
}
