package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_6_0)
@ProtoModel
internal interface SceneGalleryProgressInfo {
    var key: String
    var progressStageList: List<Int>
    var progress: Int
    var uiForm: Int
}