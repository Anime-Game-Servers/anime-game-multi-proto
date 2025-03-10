package org.anime_game_servers.multi_proto.gi.data.gallery.handball

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_4_0)
@ProtoModel
internal interface PlaceInfo {
    var pos: Vector
    var rot: Vector
}