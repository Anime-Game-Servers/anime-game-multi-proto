package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.rotation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface TowerDailyRewardProgressChangeNotify {
    var dailyFloorId: Int
    var dailyLevelIndex: Int
}