package org.anime_game_servers.multi_proto.gi.data.gallery.balloon

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface BalloonPlayerInfo {
    var combo: Int
    var comboDisableTime: Int
    var curScore: Int
    var uid: Int
}