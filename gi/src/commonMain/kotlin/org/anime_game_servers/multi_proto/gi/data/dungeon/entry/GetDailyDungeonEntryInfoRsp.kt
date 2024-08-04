package org.anime_game_servers.multi_proto.gi.data.dungeon.entry

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.RESPONSE)
internal interface GetDailyDungeonEntryInfoRsp {
    var dailyDungeonInfoList: List<DailyDungeonEntryInfo>
    var retCode: Int
}
