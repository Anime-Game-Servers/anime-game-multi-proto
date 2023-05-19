package data.activity.flight

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_1_0)
@ProtoCommand(CommandType.REQUEST)
interface FlightActivityRestartReq {
    var scheduleId: Int
    var groupId: Int
}