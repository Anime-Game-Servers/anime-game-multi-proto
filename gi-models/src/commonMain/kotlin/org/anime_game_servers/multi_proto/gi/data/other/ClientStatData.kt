package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@RemovedIn(GI_1_0_0)
@ProtoModel
internal interface ClientStatData {
    var fps: Float
    var memory: Float
    var x: Float
    var y: Float
    var z: Float
}