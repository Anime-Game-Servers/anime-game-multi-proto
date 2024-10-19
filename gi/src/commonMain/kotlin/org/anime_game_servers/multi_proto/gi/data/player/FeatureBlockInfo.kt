package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface FeatureBlockInfo {
    var featureType: Int
    var endTime: Int
}
