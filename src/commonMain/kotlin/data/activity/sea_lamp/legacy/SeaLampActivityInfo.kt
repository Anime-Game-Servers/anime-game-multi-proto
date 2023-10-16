package data.activity.sea_lamp.legacy

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)@RemovedIn(VERSION.V0_9_0)
@ProtoModel
interface SeaLampActivityInfo {
    var activityId: Int
    var scheduleId: Int
    var phase: Int
    var progress : Int
}