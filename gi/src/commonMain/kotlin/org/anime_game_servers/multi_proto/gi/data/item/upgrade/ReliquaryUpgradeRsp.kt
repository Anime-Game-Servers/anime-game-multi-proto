package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface ReliquaryUpgradeRsp {
    var curLevel: Int
    var oldLevel: Int
    var powerUpRate: Int
    var retcode: Int
    var targetReliquaryGuid: Long
    @AddedIn(GI_CB2)
    var curAppendPropList: List<Int>
    @AddedIn(GI_CB2)
    var oldAppendPropList: List<Int>
}
