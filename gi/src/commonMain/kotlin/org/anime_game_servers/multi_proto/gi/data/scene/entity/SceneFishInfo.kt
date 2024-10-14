package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface SceneFishInfo {
    var fishId: Int
    var fishPoolEntityId: Int
    var fishPoolPos: Vector
    var fishPoolGadgetId: Int
    @AddedIn(GI_2_4_0)
    var lastShockTime: Int
}
