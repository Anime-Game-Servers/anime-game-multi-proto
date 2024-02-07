package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_2_0)
@ProtoModel
internal interface SceneGalleryFungusFighterTrainingInfo {
    var buffId: Int
    var buffStartTime: Int
    var buffLastTime: Int
    var killedMonsterCount: Int
    var maxMonsterCount: Int
    var maxSkillCount: Int
    var restSkillCount: Int
}