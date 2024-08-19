package org.anime_game_servers.multi_proto.gi.data.city_reputation.bounty

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface HuntingRevealClueNotify {
    var cluePosition: Vector
    var finishClueCount: Int
    var finishedGroupId: Int
    var huntingPair: HuntingPair
}
