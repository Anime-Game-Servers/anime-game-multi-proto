package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
internal interface ActivityTakeWatcherRewardBatchRsp {
    var activityId: Int
    var itemList: List<ItemParam>
    var watcherIdList: List<Int>
    var retcode: Retcode
}
