package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface MathQuaternion {
    var x: Float
    var y: Float
    var z: Float
    var w: Float
}