package org.anime_game_servers.multi_proto.gi.data.activity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.REQUEST)
interface ActivityTakeWatcherRewardReq {
    var activityId: Int
    var watcherId: Int
}