package org.anime_game_servers.multi_proto.gi.data.item.forge

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CLIENT)
internal interface ForgeQueueDataNotify {
    var forgeQueueMap: Map<Int, org.anime_game_servers.multi_proto.gi.data.item.forge.ForgeQueueData>
    var removedForgeQueueList: List<Int>
}
