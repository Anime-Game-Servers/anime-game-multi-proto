package org.anime_game_servers.multi_proto.gi.data.gallery.home

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface RacingGallerySettleInfo {
    var reason: GalleryStopReason
    var useTime: Int
    var winnerUid: Int
}
