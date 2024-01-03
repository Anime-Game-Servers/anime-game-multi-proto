package data.activity.echo_shell

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.REQUEST)
interface EchoShellTakeRewardReq {
    var rewardId: Int
}