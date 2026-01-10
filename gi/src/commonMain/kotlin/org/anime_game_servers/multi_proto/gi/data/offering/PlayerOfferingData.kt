package org.anime_game_servers.multi_proto.gi.data.offering

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface PlayerOfferingData {
    var level: Int
    var offeringId: Int
    var takenLevelRewardList: List<Int>
    @AddedIn(GI_2_0_0)
    var isFirstInteract: Boolean
    @AddedIn(GI_2_0_0)
    var isNewMaxLevel: Boolean
}
