package org.anime_game_servers.multi_proto.gi.data.activity.treasure_seelie

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface TreasureSeelieActivityDetailInfo {
    var isContentClosed: Boolean
    var regionDataList: List<TreasureSeelieRegionData>
    var treasureCloseTime: Int
}
