package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_5_0)
@ProtoModel
internal interface SceneGalleryHideAndSeekInfo {
    var visibleUidList: List<Int>
    var caughtUidList: List<Int>
}