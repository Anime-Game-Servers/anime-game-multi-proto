package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_7_0)
@ProtoModel
internal interface SceneGalleryHomeSeekFurnitureInfo {
    var playerScoreMap: Map<Int,Int>
    var curTideTotalNum: Int
    var curTideLeftNum: Int
    var curTideDurationTime: Int
}