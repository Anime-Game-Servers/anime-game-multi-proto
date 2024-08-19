package org.anime_game_servers.multi_proto.gi.data.blossom

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface BlossomScheduleInfo {
    var circleCampId: Int
    var finishProgress: Int
    var progress: Int
    var refreshId: Int
    var round: Int
    var state: Int
}
