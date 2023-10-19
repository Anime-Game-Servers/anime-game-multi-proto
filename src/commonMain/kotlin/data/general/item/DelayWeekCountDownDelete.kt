package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_4_0)
@ProtoModel
interface DelayWeekCountDownDelete {
    var deleteTimeNumMap: Map<Int,Int>
    var configDelayWeek: Int
    var configCountDownTime: Int
}