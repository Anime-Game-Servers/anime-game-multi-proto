package data.dungeon

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetDailyDungeonEntryInfoRsp {
    var dailyDungeonInfoList: List<DailyDungeonEntryInfo>
    var retCode: Int
}
