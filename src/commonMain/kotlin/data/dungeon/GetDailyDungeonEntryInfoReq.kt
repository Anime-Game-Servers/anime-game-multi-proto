package data.dungeon

import annotations.AddedIn
import data.general.Uint32Pair
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.REQUEST)
interface GetDailyDungeonEntryInfoReq {
    var sceneId: Int
}
