package data.activity

import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
interface ActivityPushTipsData {
    var state: ActivityPushTipsState
    var activityPushTipsId: Int
}