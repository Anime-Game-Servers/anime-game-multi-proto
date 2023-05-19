package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface ActivityCondStateChangeNotify {
    var scheduleId: Int
    var activityId: Int
    var meetCondList: List<Int>
    var expireCondList: List<Int>
}