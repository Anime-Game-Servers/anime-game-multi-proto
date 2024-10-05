package org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel(alternativeNames = ["ChannellerSlabLoopDungeonInfo"])
internal interface ChannelerSlabLoopDungeonInfo {
    var dungeonIndex: Int
    var isFirstPassRewardTaken: Boolean
    var isOpen: Boolean
    var lastConditionIdList: List<Int>
    var openTime: Int
    var score: Int
}
