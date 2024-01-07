package data.activity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface ActivityWatcherInfo {
    var curProgress: Int
    var isTakenReward: Boolean
    var totalProgress: Int
    var watcherId: Int
}