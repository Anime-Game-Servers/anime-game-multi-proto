package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface GadgetPlayStopNotify {
    var costTime: Int
    var entityId: Int
    var isWin: Boolean
    var playType: Int
    var score: Int
    var uidInfoList: List<GadgetPlayUidInfo>
}