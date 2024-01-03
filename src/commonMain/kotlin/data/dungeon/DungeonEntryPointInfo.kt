package data.dungeon

import annotations.AddedIn
import messages.VERSION.*
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(V2_8_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DungeonEntryPointInfo {
    var sceneId: Int
    var pointId: Int
    var dungeonEntryList: List<DungeonEntryInfo>
    var recommendDungeonId: Int
}