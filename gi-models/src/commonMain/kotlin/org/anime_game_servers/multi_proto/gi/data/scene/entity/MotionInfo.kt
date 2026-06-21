package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.core.annotations.Converters
import org.anime_game_servers.multi_proto.gi.converters.IntToLongConverter

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface MotionInfo {
    var pos: Vector
    var rot: Vector
    var speed: Vector
    var state: MotionState
    var params: List<Vector>
    @AddedIn(Version.GI_1_2_0)
    var refPos: Vector
    @AddedIn(Version.GI_1_2_0)
    var refId: Int
    @AddedIn(Version.GI_1_2_0)
    var sceneTime: Int
    @Converters(IntToLongConverter::class)
    @AddedIn(Version.GI_1_5_0) // Int in versions before 2.6
    var intervalVelocity: Long
}
