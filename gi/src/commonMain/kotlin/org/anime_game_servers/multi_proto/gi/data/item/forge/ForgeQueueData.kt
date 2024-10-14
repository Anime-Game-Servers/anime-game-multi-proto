package org.anime_game_servers.multi_proto.gi.data.item.forge

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface ForgeQueueData {
    var avatarId: Int
    var finishCount: Int
    var forgeId: Int
    var nextFinishTimestamp: Int
    var queueId: Int
    var totalFinishTimestamp: Int
    var unfinishCount: Int
}
