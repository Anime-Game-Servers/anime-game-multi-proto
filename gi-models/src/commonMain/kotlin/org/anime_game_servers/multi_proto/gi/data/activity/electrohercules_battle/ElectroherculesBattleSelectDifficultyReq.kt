package org.anime_game_servers.multi_proto.gi.data.activity.electrohercules_battle

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_4_0)
@ProtoCommand(REQUEST)
internal interface ElectroherculesBattleSelectDifficultyReq {
    var diffculty: Int
    var stageId: Int
}
