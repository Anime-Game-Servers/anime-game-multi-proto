package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface AbilityInvocationFixedNotify {
    @RemovedIn(GI_CB2)
    var entityId: Int
    @RemovedIn(GI_0_9_0)
    var forwardPeer: Int
    @RemovedIn(GI_0_9_0)
    var forwardPeers: List<Int>
    @RemovedIn(GI_0_9_0)
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    var invoke1st: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
    var invoke2nd: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
    var invoke3rd: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
    var invoke4th: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
    var invoke5th: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
    var invoke6th: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntry
}
