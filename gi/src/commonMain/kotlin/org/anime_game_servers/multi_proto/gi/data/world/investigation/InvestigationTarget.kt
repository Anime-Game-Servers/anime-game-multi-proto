package org.anime_game_servers.multi_proto.gi.data.world.investigation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface InvestigationTarget {
    var investigationId: Int
    var questId: Int
    var state: InvestigationTargetState
    @AddedIn(GI_0_9_0)
    var progress: Int
    @AddedIn(GI_0_9_0)
    var totalProgress: Int
}
