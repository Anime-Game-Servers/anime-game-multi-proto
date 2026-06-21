package org.anime_game_servers.multi_proto.gi.data.activity.photo

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_6_0)
@ProtoModel
internal interface PhotoPosData {
    var center: Vector
    var isOpen: Boolean
    var isView: Boolean
    var openTime: Int
    var posId: Int
}
