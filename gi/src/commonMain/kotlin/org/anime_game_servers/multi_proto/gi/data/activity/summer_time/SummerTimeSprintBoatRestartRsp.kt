package org.anime_game_servers.multi_proto.gi.data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.SeaLampActivityPlayerInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.RESPONSE)
interface SummerTimeSprintBoatRestartRsp {
    var scheduleId: Int
    var groupId: Int
    var retcode: Int
}