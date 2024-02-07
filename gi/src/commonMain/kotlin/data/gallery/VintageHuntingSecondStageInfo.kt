package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_1_0)
@ProtoModel
internal interface VintageHuntingSecondStageInfo {
    var totalNum: Int
    var captureAnimalNum: Int
    var leftNum: Int
}