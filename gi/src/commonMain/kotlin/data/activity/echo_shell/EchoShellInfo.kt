package data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_6_0)
@ProtoModel
interface EchoShellInfo {
    var shellId: Int
}