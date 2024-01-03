package data.activity.summer_time

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface SummerTimeSprintBoatRestartReq {
    var scheduleId: Int
    var groupId: Int
}