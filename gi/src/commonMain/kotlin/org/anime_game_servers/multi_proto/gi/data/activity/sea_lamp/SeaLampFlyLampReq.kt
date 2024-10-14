package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
interface SeaLampFlyLampReq {
    var itemId: Int
    @RemovedIn(GI_1_3_0)
    var wishText: String
    @AddedIn(GI_0_9_0)
    var itemNum: Int
    @AddedIn(GI_1_0_0)
    @RemovedIn(GI_1_3_0)
    var activityId: Int
    @AddedIn(GI_1_3_0)
    var param: Int
    @AddedIn(GI_1_3_0)
    var pos: Vector
}