package data.achievement

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
interface Achievement {
    var finishedTimestamp: Int
    var status: Status
    var curProgress: Int
    var id: Int
    var totalProgress: Int
}