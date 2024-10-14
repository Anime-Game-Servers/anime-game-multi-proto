package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_1_0_0)
@ProtoCommand(NOTIFY)
internal interface ActivityCondStateChangeNotify {
    var activityId: Int
    var expireCondList: List<Int>
    var meetCondList: List<Int>
    var scheduleId: Int
    @AddedIn(GI_1_2_0)
    var activatedSaleIdList: List<Int>
    @AddedIn(GI_2_1_0)
    var disableTransferPointInteractionList: List<Uint32Pair>
}