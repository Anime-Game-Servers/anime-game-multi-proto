package data.activity.echo_shell

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_6_0)
@ProtoModel
interface EchoShellInfo {
    var shellId: Int
}