package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface MapMarkPoint {
    var fromType: MapMarkFromType
    var monsterId: Int
    var name: String
    var pointType: MapMarkPointType
    var pos: Vector
    var questId: Int
    var sceneId: Int
}
