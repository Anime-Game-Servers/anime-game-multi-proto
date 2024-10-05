package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(NOTIFY)
interface ActivityCoinInfoNotify {
    var activityCoinMap: Map<Int, Int>
    var activityId: Int
    var scheduleId: Int
}
