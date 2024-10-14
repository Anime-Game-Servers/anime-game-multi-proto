package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface GetActivityInfoRsp {
    var retcode: Retcode
    var activityInfoList: List<ActivityInfo>
    @AddedIn(GI_1_2_0)
    var activatedSaleIdList: List<Int>
    @AddedIn(GI_2_1_0)
    var disableTransferPointInteractionList: List<Uint32Pair>
}
