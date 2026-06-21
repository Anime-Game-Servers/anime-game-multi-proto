package org.anime_game_servers.multi_proto.gi.data.gallery.balloon

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface BalloonGallerySettleInfo {
    var hitCount: Int
    var ownerUid: Int
    var reason: GalleryStopReason
    var score: Int
}
