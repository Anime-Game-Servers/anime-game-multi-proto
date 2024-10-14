package org.anime_game_servers.multi_proto.gi.data.gallery.sumo

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface SceneGallerySumoInfo {
    var killEliteMonsterNum: Int
    @AltName("kill_normal_mosnter_num", "killNormalMosnterNum")
    var killNormalMonsterCount: Int
    var score: Int
}