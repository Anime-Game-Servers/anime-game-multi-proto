package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtRushMoveNotify {
    @RemovedIn(GI_0_9_0)
    var entityId: Int
    @RemovedIn(GI_0_9_0)
    var faceAngleCompact: Int
    var forwardType: ForwardType
    @RemovedIn(GI_0_9_0)
    var pos: Vector
    @RemovedIn(GI_0_9_0)
    var rushAttackTargetPos: Vector
    @RemovedIn(GI_0_9_0)
    var rushToPos: Vector
    @RemovedIn(GI_0_9_0)
    var stateNameHash: Int
    @RemovedIn(GI_0_9_0)
    var timerange: Float
    @RemovedIn(GI_0_9_0)
    var velocity: Vector
    @AddedIn(GI_0_9_0)
    var evtRushMoveInfo: EvtRushMoveInfo
}
