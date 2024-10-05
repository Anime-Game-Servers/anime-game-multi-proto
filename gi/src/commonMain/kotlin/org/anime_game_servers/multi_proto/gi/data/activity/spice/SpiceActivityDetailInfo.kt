package org.anime_game_servers.multi_proto.gi.data.activity.spice

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface SpiceActivityDetailInfo {
    var currentIncreaseAvatarFetterTimes: Int
    var increaseAvatarFetterLimitTimes: Int
    var spiceStageDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.spice.SpiceStageData>
}
