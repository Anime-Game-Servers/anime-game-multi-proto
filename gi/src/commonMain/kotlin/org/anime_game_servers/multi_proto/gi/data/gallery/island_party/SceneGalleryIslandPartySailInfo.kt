package org.anime_game_servers.multi_proto.gi.data.gallery.island_party

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStartSource

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface SceneGalleryIslandPartySailInfo {
    var cleanProgress: Int
    var coin: Int
    var killProgress: Int
    var maxCleanProgress: Int
    var maxKillProgress: Int
    var stage: IslandPartySailStage
    var startSource: GalleryStartSource
}