package data.ability

import data.battle.ForwardType
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
    var forwardType: ForwardType
    var invoke1st: AbilityInvokeEntry
    var invoke2nd: AbilityInvokeEntry
    var invoke3rd: AbilityInvokeEntry
    var invoke4th: AbilityInvokeEntry
    var invoke5th: AbilityInvokeEntry
    var invoke6th: AbilityInvokeEntry
}
