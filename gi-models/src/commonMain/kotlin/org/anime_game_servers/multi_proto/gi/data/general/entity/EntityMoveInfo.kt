package org.anime_game_servers.multi_proto.gi.data.general.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.MotionInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
internal interface EntityMoveInfo {
    var entityId: Int
    var motionInfo: MotionInfo
    var sceneTime: Int
    var reliableSeq: Int
    var isReliable: Boolean
}