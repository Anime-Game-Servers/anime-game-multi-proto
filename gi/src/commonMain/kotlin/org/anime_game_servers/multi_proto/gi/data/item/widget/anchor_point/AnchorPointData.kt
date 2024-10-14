package org.anime_game_servers.multi_proto.gi.data.item.widget.anchor_point

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface AnchorPointData {
    var anchorPointId: Int
    var endTime: Int
    var pos: Vector
    var rot: Vector
    @AddedIn(GI_2_4_0)
    var sceneId: Int
}
