package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
interface SeaLampActivityInfo {
    var activityId: Int
    var scheduleId: Int
    var phase: Int
    var progress : Int
}