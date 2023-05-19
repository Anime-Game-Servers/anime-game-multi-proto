package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface ActivityWatcherInfo {
    var curProgress: Int
    var isTakenReward: Boolean
    var totalProgress: Int
    var watcherId: Int
}