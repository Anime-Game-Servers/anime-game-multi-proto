package org.anime_game_servers.multi_proto.gi.data.activity.instable_spray

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_0_0)
@ProtoCommand(NOTIFY)
internal interface InstableSprayLevelFinishNotify {
    var isNeedSwitchTeam: Boolean
    var isSkipBlackScreen: Boolean
    var levelId: Int
    var round: Int
    var stageId: Int
}
