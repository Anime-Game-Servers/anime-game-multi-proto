package data.dungeon

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DailyDungeonEntryInfo {
    var dungeonEntryId: Int
    var dungeonEntryConfigId: Int
    var recommendDungeonId: Int
    @AddedIn(GI_1_2_0)
    var recommendDungeonEntryInfo: DungeonEntryInfo
}