package data.activity

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
interface ActivityPushTipsData {
    var state: ActivityPushTipsState
    var activityPushTipsId: Int
}
