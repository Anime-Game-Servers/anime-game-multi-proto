package data.activity.echo_shell

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_8_0)
@ProtoModel
interface SummerTimeDungeonInfo {
    var takenChestCount: Int
    var totalChestCount: Int
    var takenShellCount: Int
    var dungeonId: Int
    var totalShellCount: Int
}