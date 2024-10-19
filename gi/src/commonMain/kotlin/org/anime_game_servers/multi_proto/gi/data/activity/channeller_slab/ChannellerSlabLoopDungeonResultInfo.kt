package org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel(alternativeNames = ["ChannelerSlabLoopDungeonResultInfo"])
internal interface ChannellerSlabLoopDungeonResultInfo {
    var challengeMaxScore: Int
    var challengeScore: Int
    var dungeonIndex: Int
    var isInTimeLimit: Boolean
    var isSuccess: Boolean
}
