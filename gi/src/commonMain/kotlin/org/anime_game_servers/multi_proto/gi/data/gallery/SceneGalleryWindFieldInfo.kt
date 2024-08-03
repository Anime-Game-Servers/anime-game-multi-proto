package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_1_0)
@ProtoModel
internal interface SceneGalleryWindFieldInfo {
    var showId: Int
    var challengeTimestamp: Int
    var challengeTotalTime: Int
    var challengeBallCurCount: Int
    var challengeBallMaxCount: Int
    var killedMonsterNum: Int
    var elementBallNum: Int
    var coinNum: Int
}