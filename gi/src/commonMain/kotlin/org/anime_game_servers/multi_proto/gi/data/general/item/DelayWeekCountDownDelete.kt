package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_4_0)
@ProtoModel("MaterialDeleteInfo")
interface DelayWeekCountDownDelete {
    var deleteTimeNumMap: Map<Int,Int>
    var configDelayWeek: Int
    var configCountDownTime: Int
}