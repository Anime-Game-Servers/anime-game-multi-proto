package data.dungeon

import annotations.AddedIn
import data.general.Uint32Pair
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
interface DungeonEntryInfoReq {
    var pointId: Int
    @AddedIn(VERSION.V2_7_0)
    var sceneId: Int
    @AddedIn(VERSION.V2_8_0)
    var scenePointIdList: List<Uint32Pair>
}
