package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
import org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfo
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtAnimatorParameterNotify {
    @RemovedIn(GI_0_9_0)
    var entityId: Int
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    @RemovedIn(GI_0_9_0)
    var isServerCache: Boolean
    @RemovedIn(GI_0_9_0)
    var nameId: Int
    @RemovedIn(GI_0_9_0)
    var value: org.anime_game_servers.multi_proto.gi.data.scene.entity.AnimatorParameterValueInfo
    @AddedIn(GI_0_9_0)
    var animatorParamInfo: org.anime_game_servers.multi_proto.gi.data.battle.event.EvtAnimatorParameterInfo
}
