package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface SeaLampFlyLampRsp {
    var retcode: Retcode
    @RemovedIn(GI_1_3_0)
    var totalContribution: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_3_0)
    var addContribution: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_3_0)
    var addProgress: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_3_0)
    var remainFlyNum: Int
    @AddedIn(GI_0_9_0)
    var itemNum: Int
    @AddedIn(GI_1_3_0)
    var itemId: Int
}