package org.anime_game_servers.multi_proto.gi.data.activity.fleur_fair

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_4_0)
@ProtoCommand(REQUEST)
interface FleurFairMusicGameSettleReq {
    var combo: Int
    var correctHit: Int
    var musicBasicId: Int
    var score: Int
}
