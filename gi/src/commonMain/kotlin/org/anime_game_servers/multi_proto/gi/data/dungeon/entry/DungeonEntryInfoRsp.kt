package org.anime_game_servers.multi_proto.gi.data.dungeon.entry

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.RESPONSE)
internal interface DungeonEntryInfoRsp {
    var retCode: Retcode
    var pointId: Int
    var dungeonEntryList: List<DungeonEntryInfo>
    var recommendDungeonId: Int
    @AddedIn(Version.GI_2_8_0)
    var dungeonEntryPointList: List<DungeonEntryPointInfo>
}
