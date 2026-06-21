package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface UseItemReq {
    var count: Int
    var guid: Long
    var targetGuid: Long
    @AddedIn(GI_0_9_0)
    var optionIdx: Int
    @AddedIn(GI_1_0_0)
    var isEnterMpDungeonTeam: Boolean
}
