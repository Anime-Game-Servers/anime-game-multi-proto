package data.dungeon

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface DungeonEntryInfoRsp {
    var pointId: Int
    var dungeonEntryList: List<DungeonEntryInfo>
    var recommendDungeonId: Int
    var retCode: Int
    @AddedIn(Version.GI_2_8_0)
    var dungeonEntryPointList: List<DungeonEntryPointInfo>
}
