package data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtSetAttackTargetNotify {
    @RemovedIn(GI_0_9_0)
    var attackTargetId: Int
    @RemovedIn(GI_0_9_0)
    var entityId: Int
    var forwardType: ForwardType
    @AddedIn(GI_0_9_0)
    var evtSetAttackTargetInfo: EvtSetAttackTargetInfo
}
