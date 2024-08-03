package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityInvokeEntry {
    var abilityData: ByteArray
    var argumentType: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeArgument
    var head: org.anime_game_servers.multi_proto.gi.data.ability.AbilityInvokeEntryHead
    @AddedIn(GI_CB2)
    var entityId: Int
    @AddedIn(GI_0_9_0)
    var forwardPeer: Int
    @AddedIn(GI_0_9_0)
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    @AddedIn(GI_1_0_0)
    var eventId: Int
    @AddedIn(GI_2_2_0)
    var totalTickTime: Double
}
