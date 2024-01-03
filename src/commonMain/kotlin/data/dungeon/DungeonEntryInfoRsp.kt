package data.dungeon

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface DungeonEntryInfoRsp {
    var pointId: Int
    var dungeonEntryList: List<DungeonEntryInfo>
    var recommendDungeonId: Int
    var retCode: Int
    @AddedIn(VERSION.V2_8_0)
    var dungeonEntryPointList: List<DungeonEntryPointInfo>
}
