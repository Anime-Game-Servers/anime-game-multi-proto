package org.anime_game_servers.multi_proto.gi.data.gallery.broken_floor

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface SceneGalleryBrokenFloorInfo {
    var endTime: Int
    var fallCountMap: Map<Int, Int>
}
