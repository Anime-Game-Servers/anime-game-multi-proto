package data.activity.salesman

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface SalesmanTakeRewardRsp {
    var scheduleId: Int
    var rewardId: Int
    var position: Int
    var retcode: Int
}