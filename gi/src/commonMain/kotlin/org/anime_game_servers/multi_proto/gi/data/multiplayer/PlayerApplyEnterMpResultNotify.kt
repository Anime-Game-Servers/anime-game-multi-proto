package org.anime_game_servers.multi_proto.gi.data.multiplayer

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface PlayerApplyEnterMpResultNotify {
    var isAgreed: Boolean
    var reason: MpEnterResultReason
    var targetUid: Int
    @AddedIn(GI_1_0_0)
    var targetNickname: String
}
