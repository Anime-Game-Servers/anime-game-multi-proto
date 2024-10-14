package org.anime_game_servers.multi_proto.gi.data.city_reputation.bounty

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface HuntingOngoingNotify {
    var failTime: Int
    var finishClueCount: Int
    var huntingPair: HuntingPair
    var isStarted: Boolean
    var nextPosition: Vector
    @AddedIn(GI_2_0_0)
    var isFinal: Boolean
}
