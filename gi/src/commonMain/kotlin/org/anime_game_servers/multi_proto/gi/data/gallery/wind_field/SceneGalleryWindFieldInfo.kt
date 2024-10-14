package org.anime_game_servers.multi_proto.gi.data.gallery.wind_field

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface SceneGalleryWindFieldInfo {
    var challengeBallCurCount: Int
    var challengeBallMaxCount: Int
    var challengeTimestamp: Int
    var challengeTotalTime: Int
    var coinNum: Int
    var elementBallNum: Int
    var killedMonsterNum: Int
    var showId: Int
}
