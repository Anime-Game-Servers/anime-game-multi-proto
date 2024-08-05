package org.anime_game_servers.multi_proto.gi.data.gallery.summer_time_v2_boat

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface SummerTimeV2BoatGallerySettleInfo {
    var galleryId: Int
    var param1: Int
    var param2: Int
    var param3: Int
    var reason: GalleryStopReason
    var usedTime: Int
}
