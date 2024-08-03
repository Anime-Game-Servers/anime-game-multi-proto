package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
interface DungeonEntryInfoReq {
    var pointId: Int
    @AddedIn(Version.GI_2_7_0)
    var sceneId: Int
    @AddedIn(Version.GI_2_8_0)
    var scenePointIdList: List<Uint32Pair>
}
