package org.anime_game_servers.multi_proto.gi.data.other.ai_snapshot

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface AISnapshotEntityData {
    var aiTargetId: Int
    var attackTargetId: Int
    var distanceToPlayer: Float
    var entityId: Int
    var finishedSkillCycles: List<AISnapshotEntitySkillCycle>
    var hittingAvatars: Map<Int, Int>
    var movedDistance: Float
    var realTime: Float
    var tactic: Int
    var threatListSize: Int
    var threatTargetId: Int
    var tickTime: Float
}
