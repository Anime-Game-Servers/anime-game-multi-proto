package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(NOTIFY)
internal interface CheckAddItemExceedLimitNotify {
    var exceededItemList: List<Int>
    var exceededItemTypeList: List<Int>
    var isDrop: Boolean
    @AddedIn(GI_2_0_0)
    var msgType: org.anime_game_servers.multi_proto.gi.data.item.ItemExceedLimitMsgType
    @AddedIn(GI_3_1_0)
    var reason: Int
}
