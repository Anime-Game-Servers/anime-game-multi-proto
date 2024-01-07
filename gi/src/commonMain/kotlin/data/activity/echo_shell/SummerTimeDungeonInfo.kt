package data.activity.echo_shell

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
interface SummerTimeDungeonInfo {
    var takenChestCount: Int
    var totalChestCount: Int
    var takenShellCount: Int
    var dungeonId: Int
    var totalShellCount: Int
}