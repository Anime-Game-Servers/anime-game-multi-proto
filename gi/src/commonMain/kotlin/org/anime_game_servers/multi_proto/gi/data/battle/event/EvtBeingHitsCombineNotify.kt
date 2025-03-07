package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CLIENT)
internal interface EvtBeingHitsCombineNotify {
    var evtBeingHitInfoList: List<EvtBeingHitInfo>
    @AddedIn(GI_0_9_0)
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
}
