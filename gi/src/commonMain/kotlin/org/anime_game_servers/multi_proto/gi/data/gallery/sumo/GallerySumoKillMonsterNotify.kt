package org.anime_game_servers.multi_proto.gi.data.gallery.sumo

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface GallerySumoKillMonsterNotify {
    var galleryId: Int
    var killEliteMonsterNum: Int
    @AltName("killNormalMonsterNum")
    var killNormalMosnterNum: Int
    var score: Int
}
