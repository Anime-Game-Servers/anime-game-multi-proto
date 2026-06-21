package org.anime_game_servers.multi_proto.gi.data.scene.camera

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface BeginCameraSceneLookNotify {
    var duration: Float
    var isForce: Boolean
    var isRecoverKeepCurrent: Boolean
    var lookPos: Vector
    @AddedIn(GI_CB2)
    var isAllowInput: Boolean
    @AddedIn(GI_1_4_0)
    var followPos: Vector
    @AddedIn(GI_1_4_0)
    var isChangePlayMode: Boolean
    @AddedIn(GI_1_4_0)
    var isForceWalk: Boolean
    @AddedIn(GI_1_4_0)
    var isSetFollowPos: Boolean
    @AddedIn(GI_1_4_0)
    @AltName("isSetScreenxy")
    var isSetScreenXy: Boolean
    @AddedIn(GI_1_4_0)
    var otherParams: List<String>
    @AddedIn(GI_1_4_0)
    var screenX: Float
    @AddedIn(GI_1_4_0)
    var screenY: Float
    @AddedIn(GI_2_6_0)
    var customRadius: Float
    @AddedIn(GI_2_6_0)
    var keepRotType: KeepRotType
    @AddedIn(GI_2_7_0)
    var entityId: Int
    @AddedIn(GI_3_0_0)
    var blendDuration: Float
    @AddedIn(GI_3_0_0)
    var blendType: Int
    @AddedIn(GI_3_0_0)
    var disableProtect: Int
    @AddedIn(GI_3_0_0)
    var isAbsFollowPos: Boolean
}
