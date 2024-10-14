package org.anime_game_servers.multi_proto.gi.data.scene.script

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface ExecuteGadgetLuaReq {
    var param1: Int
    var param2: Int
    var param3: Int
    var sourceEntityId: Int
}
