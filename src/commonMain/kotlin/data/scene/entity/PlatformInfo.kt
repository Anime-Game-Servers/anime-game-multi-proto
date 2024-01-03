package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import data.general.MathQuaternion
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB2
import messages.VERSION.V1_1_0
import messages.VERSION.V1_2_0
import messages.VERSION.V1_3_0

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface PlatformInfo {
    var routeId: Int
    var startIndex: Int
    var startRouteTime: Int
    var startSceneTime: Int
    @RemovedIn(V1_3_0)
    var tempRouteTime: Int
    @RemovedIn(V1_3_0)
    var tempStartRouteTime: Int
    var startPos: Vector
    var isStarted: Boolean
    @AddedIn(VCB2)
    var startRot: MathQuaternion
    @AddedIn(VCB2)
    var stopSceneTime: Int
    @AddedIn(V1_1_0)
    var posOffset: Vector
    @AddedIn(V1_1_0)
    var rotOffset: MathQuaternion
    @AddedIn(V1_1_0) @RemovedIn(V1_3_0)
    var isUseConfigRoute: Boolean
    @AddedIn(V1_3_0)
    var movingPlatformType: MovingPlatformType
    @AddedIn(V1_2_0)
    var isActive: Boolean
    @AddedIn(V1_3_0)
    var route: Route
    @AddedIn(V1_3_0)
    var pointId: Int
}