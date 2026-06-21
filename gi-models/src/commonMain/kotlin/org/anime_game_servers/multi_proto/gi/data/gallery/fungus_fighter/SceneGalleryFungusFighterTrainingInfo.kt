package org.anime_game_servers.multi_proto.gi.data.gallery.fungus_fighter

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface SceneGalleryFungusFighterTrainingInfo {
    var buffId: Int
    var buffLastTime: Int
    var buffStartTime: Int
    var killedMonsterCount: Int
    var maxMonsterCount: Int
    var maxSkillCount: Int
    var restSkillCount: Int
}
