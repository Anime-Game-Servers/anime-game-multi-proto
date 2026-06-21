package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface MaterialDeleteReturnNotify {
    var deleteMaterialMap: Map<Int, Int>
    var returnItemMap: Map<Int, Int>
    @AddedIn(GI_2_2_0)
    var type: MaterialDeleteReturnType
}
