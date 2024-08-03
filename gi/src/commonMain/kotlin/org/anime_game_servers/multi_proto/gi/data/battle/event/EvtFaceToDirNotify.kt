package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtFaceToDirNotify {
    @RemovedIn(GI_0_9_0)
    var entityId: Int
    @RemovedIn(GI_0_9_0)
    var faceDir: Vector
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    @AddedIn(GI_0_9_0)
    var evtFaceToDirInfo: org.anime_game_servers.multi_proto.gi.data.battle.event.EvtFaceToDirInfo
}
