package data.activity.echo_shell

import annotations.AddedIn
import annotations.RemovedIn
import data.activity.sea_lamp.SeaLampActivityPlayerInfo
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.RESPONSE)
interface EchoShellTakeRewardRsp {
    var rewardId: Int
    var retcode: Int
}