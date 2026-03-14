package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
internal interface MapAreaInfo {
    var mapAreaId: Int
    var isOpen: Boolean
}
