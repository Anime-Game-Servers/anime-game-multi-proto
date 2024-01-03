package data.activity.echo_shell

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_6_0)
@ProtoCommand(CommandType.NOTIFY)
interface EchoShellUpdateNotify {
    var shellId: Int
}