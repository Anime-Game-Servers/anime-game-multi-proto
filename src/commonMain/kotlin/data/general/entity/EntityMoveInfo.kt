package data.general.entity

import annotations.AddedIn
import data.scene.entity.MotionInfo
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface EntityMoveInfo {
    var entityId: Int
    var motionInfo: MotionInfo
    var sceneTime: Int
    var reliableSeq: Int
    var isReliable: Boolean
}