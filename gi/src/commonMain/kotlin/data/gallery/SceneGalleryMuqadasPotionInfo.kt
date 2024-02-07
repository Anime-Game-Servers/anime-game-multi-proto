package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_0_0)
@ProtoModel
internal interface SceneGalleryMuqadasPotionInfo {
    var skillEnergy: Int
    var skillUseLimit: Int
    var captureWeaknessCount: Int
    var score: Int
}