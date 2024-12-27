package org.anime_game_servers.multi_proto.gi.data.activity.sumo

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface SumoSetNoSwitchPunishTimeNotify {
    var activityId: Int
    var curTeamIndex: Int
    var dungeonTeamList: List<SumoDungeonTeam>
    var nextValidSwitchTime: Int
    var noSwitchPunishTime: Int
    var stageId: Int
}