package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface ReliquaryPromoteRsp {
    var curAppendPropList: List<Int>
    var curPromoteLevel: Int
    var oldAppendPropList: List<Int>
    var oldPromoteLevel: Int
    var retcode: Int
    var targetReliquaryGuid: Long
}
