package org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_4_0)
@ProtoCommand(REQUEST)
internal interface LanV3ShadowFinishLevelReq {
    var finishTime: Int
    var levelId: Int
}
