package data.activity.announce

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface AnnounceData {
    var configId: Int
    var beginTime: Int
    var endTime: Int
    var centerSystemText: String
    var countDownText: String
    var dungeonConfirmText: String
    var centerSystemFrequency: Int
    var countDownFrequency: Int
    @AddedIn(VERSION.V1_1_0)
    var isCenterSystemLast5EveryMinutes: Boolean
}