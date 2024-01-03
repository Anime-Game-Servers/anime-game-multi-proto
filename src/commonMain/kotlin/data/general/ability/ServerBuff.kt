package data.general.ability

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_5_0
import messages.VERSION.V1_6_0

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface ServerBuff {
    var serverBuffUid: Int
    var serverBuffId: Int
    var serverBuffType: Int
    var instancedModifierId: Int
    @AddedIn(V1_5_0) @RemovedIn(V1_6_0)
    var doneOnaddedActionList: List<Int>
    @AddedIn(V1_5_0) @RemovedIn(V1_6_0)
    var isOnaddedActionAllow: Boolean
    @AddedIn(V1_6_0)
    var isModifierAdded: Boolean
}