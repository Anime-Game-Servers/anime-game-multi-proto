package data.scene.entity

import annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB1)
@ProtoModel
internal interface MotionInfo {
    var pos: Vector
    var rot: Vector
    var speed: Vector
    var state: MotionState
    var params: List<Vector>
    @AddedIn(messages.VERSION.V1_2_0)
    var refPos: Vector
    @AddedIn(messages.VERSION.V1_2_0)
    var refId: Int
    @AddedIn(messages.VERSION.V1_2_0)
    var sceneTime: Int
    @AddedIn(messages.VERSION.V1_5_0) // Int in versions before 2.6
    var intervalVelocity: Long
}
