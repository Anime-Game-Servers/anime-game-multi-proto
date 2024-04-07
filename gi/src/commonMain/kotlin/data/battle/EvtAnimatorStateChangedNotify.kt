package data.battle

import data.battle.ForwardType
import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtAnimatorStateChangedNotify {
    @RemovedIn(GI_0_9_0)
    var entityId: Int
    @RemovedIn(GI_0_9_0)
    var faceAngleCompact: Int
    var forwardType: ForwardType
    @RemovedIn(GI_0_9_0)
    var normalizedTimeCompact: Int
    @RemovedIn(GI_0_9_0)
    var toStateHash: Int
    @AddedIn(GI_CB2)
    @RemovedIn(GI_0_9_0)
    var pos: Vector
    @AddedIn(GI_0_9_0)
    var evtAnimatorStateChangedInfo: EvtAnimatorStateChangedInfo
}
