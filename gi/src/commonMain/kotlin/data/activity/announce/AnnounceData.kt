package data.activity.announce

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
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
    @AddedIn(Version.GI_1_1_0)
    var isCenterSystemLast5EveryMinutes: Boolean
}