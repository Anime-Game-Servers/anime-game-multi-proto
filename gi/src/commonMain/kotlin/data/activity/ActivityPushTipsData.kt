package data.activity

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
interface ActivityPushTipsData {
    var state: ActivityPushTipsState
    var activityPushTipsId: Int
}