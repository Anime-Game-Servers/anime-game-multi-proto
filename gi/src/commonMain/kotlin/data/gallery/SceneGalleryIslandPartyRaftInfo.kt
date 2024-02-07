package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
internal interface SceneGalleryIslandPartyRaftInfo {
    var startSource: GalleryStartSource
    var raftEntityId: Int
    var pointId: Int
    var component: Int
    var fuel: Int
    var coin: Int
}