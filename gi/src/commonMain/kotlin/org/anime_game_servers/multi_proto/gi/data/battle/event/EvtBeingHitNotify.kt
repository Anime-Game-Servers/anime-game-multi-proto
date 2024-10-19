package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtBeingHitNotify {
    @RemovedIn(GI_CB2)
    var attackResult: AttackResult
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    @RemovedIn(GI_CB2)
    var peerId: Int
    @RemovedIn(GI_CB2)
    var sceneTime: Int
    @AddedIn(GI_CB2)
    var beingHitInfo: EvtBeingHitInfo
}
