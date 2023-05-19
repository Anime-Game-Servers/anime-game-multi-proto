package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.RESPONSE)
interface GetActivityScheduleRsp {
    var activityScheduleList: List<ActivityScheduleInfo>
    var remainingFlySeaLampNum: Int
    var retcode: Int
}