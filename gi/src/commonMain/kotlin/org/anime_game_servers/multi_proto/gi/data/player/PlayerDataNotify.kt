package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.PropValue
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface PlayerDataNotify {
    var nickName: String
    var propMap: Map<Int, PropValue>
    var serverTime: Long
    @AddedIn(GI_CB2)
    var isFirstLoginToday: Boolean
    @AddedIn(GI_CB2)
    var regionId: Int
}
