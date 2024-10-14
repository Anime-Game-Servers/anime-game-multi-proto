package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface AiSyncInfo {
    var entityId: Int
    var hasPathToTarget: Boolean
    @AddedIn(GI_1_6_0)
    var isSelfKilling: Boolean
}
