package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface WidgetCreateLocationInfo {
    var pos: Vector
    var rot: Vector
}
