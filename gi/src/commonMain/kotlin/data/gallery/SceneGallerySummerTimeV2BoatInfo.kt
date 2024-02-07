package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
internal interface SceneGallerySummerTimeV2BoatInfo {
    var param1: Int
    var param2: Int
    var param3: Int
    var usedTime: Int
}