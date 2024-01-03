package data.activity.summer_time

import annotations.AddedIn
import annotations.RemovedIn
import data.activity.sea_lamp.SeaLampActivityPlayerInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.RESPONSE)
interface SummerTimeSprintBoatRestartRsp {
    var scheduleId: Int
    var groupId: Int
    var retcode: Int
}