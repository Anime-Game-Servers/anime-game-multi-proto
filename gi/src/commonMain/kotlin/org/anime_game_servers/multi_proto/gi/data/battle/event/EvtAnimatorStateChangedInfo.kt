package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface EvtAnimatorStateChangedInfo {
    var entityId: Int
    var faceAngleCompact: Int
    var normalizedTimeCompact: Int
    var pos: Vector
    var toStateHash: Int
    @AddedIn(GI_1_1_0)
    var fadeDuration: Float
    @AddedIn(GI_2_4_0)
    var handleAnimatorStateImmediately: Boolean
    @AddedIn(GI_2_7_0)
    @AltName("forceSync")
    var forcesync: Boolean
    @AddedIn(GI_2_7_0)
    var layer: Int
}
