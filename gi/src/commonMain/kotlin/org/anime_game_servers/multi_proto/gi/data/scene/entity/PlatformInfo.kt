package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.MathQuaternion
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface PlatformInfo {
    var routeId: Int
    var startIndex: Int
    var startRouteTime: Int
    var startSceneTime: Int
    @RemovedIn(GI_1_3_0)
    var tempRouteTime: Int
    @RemovedIn(GI_1_3_0)
    var tempStartRouteTime: Int
    var startPos: Vector
    var isStarted: Boolean
    @AddedIn(GI_CB2)
    var startRot: MathQuaternion
    @AddedIn(GI_CB2)
    var stopSceneTime: Int
    @AddedIn(GI_1_1_0)
    var posOffset: Vector
    @AddedIn(GI_1_1_0)
    var rotOffset: MathQuaternion
    @AddedIn(GI_1_1_0) @RemovedIn(GI_1_3_0)
    var isUseConfigRoute: Boolean
    @AddedIn(GI_1_3_0)
    var movingPlatformType: org.anime_game_servers.multi_proto.gi.data.scene.entity.MovingPlatformType
    @AddedIn(GI_1_2_0)
    var isActive: Boolean
    @AddedIn(GI_1_3_0)
    var route: org.anime_game_servers.multi_proto.gi.data.scene.entity.Route
    @AddedIn(GI_1_3_0)
    var pointId: Int
}