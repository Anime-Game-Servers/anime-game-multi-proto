package org.anime_game_servers.multi_proto.gi.data.activity

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
interface ActivityPushTipsData {
    var state: org.anime_game_servers.multi_proto.gi.data.activity.ActivityPushTipsState
    var activityPushTipsId: Int
}
