package data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(Version.GI_0_9_0)
@ProtoModel
internal interface ServerBuff {
    var serverBuffUid: Int
    var serverBuffId: Int
    var serverBuffType: Int
    var instancedModifierId: Int
    @AddedIn(GI_1_5_0) @RemovedIn(GI_1_6_0)
    var doneOnaddedActionList: List<Int>
    @AddedIn(GI_1_5_0) @RemovedIn(GI_1_6_0)
    var isOnaddedActionAllow: Boolean
    @AddedIn(GI_1_6_0)
    var isModifierAdded: Boolean
}