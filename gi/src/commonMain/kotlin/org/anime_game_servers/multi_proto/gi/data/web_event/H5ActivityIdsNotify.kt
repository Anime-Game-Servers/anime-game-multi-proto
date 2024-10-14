package org.anime_game_servers.multi_proto.gi.data.web_event

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(NOTIFY)
internal interface H5ActivityIdsNotify {
    var h5ActivityMap: Map<Int, Int>
    @AddedIn(GI_1_6_0)
    var clientRedDotTimestamp: Int
}
