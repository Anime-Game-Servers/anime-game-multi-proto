package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_3_0)
@ProtoCommand(NOTIFY)
interface SeaLampFlyLampNotify {
    var itemId: Int
    var itemNum: Int
    var param: Int
    var pos: Vector
}