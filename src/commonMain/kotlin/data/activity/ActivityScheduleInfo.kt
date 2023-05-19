package data.activity

import annotations.RemovedIn
import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
interface ActivityScheduleInfo {
    var activityId: Int
    var isOpen: Boolean
    var scheduleId: Int
    var beginTime: Int
    var endTime: Int
    @AddedIn(VERSION.V0_9_0)
    @RemovedIn(VERSION.V1_0_0)
    var hasReward: Boolean
}