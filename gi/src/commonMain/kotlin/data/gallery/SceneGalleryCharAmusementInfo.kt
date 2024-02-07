package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_2_0)
@ProtoModel
internal interface SceneGalleryCharAmusementInfo {
    var isLastLevel: Boolean
    var isFinish: Boolean
    var isSuccess: Boolean
    var curScore: Int
    var maxScore: Int
}