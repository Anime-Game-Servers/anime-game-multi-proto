package org.anime_game_servers.multi_proto.gi.data.achievement

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
interface Achievement {
    var finishedTimestamp: Int
    var status: Status
    var curProgress: Int
    var id: Int
    var totalProgress: Int
}