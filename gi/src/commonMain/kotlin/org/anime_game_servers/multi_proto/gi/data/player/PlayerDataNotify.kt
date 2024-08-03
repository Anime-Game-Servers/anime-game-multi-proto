package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.PropValue
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerDataNotify {
    var serverTime: Long
    var nickName: String
    var propMap: Map<Int, PropValue>
    @AddedIn(Version.GI_CB2)
    var isFirstLoginToday: Boolean
    @AddedIn(Version.GI_CB2)
    var regionId: Int
}