package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
internal interface SceneGalleryIslandPartySailInfo {
    var startSource: GalleryStartSource
    var stage: IslandPartySailStage
    var cleanProgress: Int
    var maxCleanProgress: Int
    var killProgress: Int
    var maxKillProgress: Int
    var coin: Int
}