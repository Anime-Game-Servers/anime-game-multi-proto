package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_4_0)
@ProtoModel
internal interface SceneGalleryBrokenFloorInfo {
    var fallCountMap: Map<Int, Int>
    var endTime: Int
}