package data.dungeon

import annotations.AddedIn
import messages.VERSION.*
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DailyDungeonEntryInfo {
    var dungeonEntryId: Int
    var dungeonEntryConfigId: Int
    var recommendDungeonId: Int
    @AddedIn(V1_2_0)
    var recommendDungeonEntryInfo: DungeonEntryInfo
}