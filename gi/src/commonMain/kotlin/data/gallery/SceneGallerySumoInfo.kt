package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_1_0)
@ProtoModel
internal interface SceneGallerySumoInfo {
    var score: Int
    @AltName("kill_normal_mosnter_num")
    var killNormalMonsterCount: Int
    var killSpecialMonsterCount: Int
}