package org.anime_game_servers.multi_proto.gi.data.wishing

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface DoGachaReq {
    var gachaRandom: Int
    var gachaScheduleId: Int
    var gachaTag: String
    var gachaTimes: Int
    var gachaType: Int
}
