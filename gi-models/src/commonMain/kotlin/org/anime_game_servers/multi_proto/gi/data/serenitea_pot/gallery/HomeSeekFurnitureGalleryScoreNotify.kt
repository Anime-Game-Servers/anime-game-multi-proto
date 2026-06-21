package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.gallery

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_2_7_0)
@ProtoCommand(NOTIFY)
internal interface HomeSeekFurnitureGalleryScoreNotify {
    var galleryId: Int
    var reason: GalleryStopReason
    var record: HomeSeekFurnitureOneRecord
}
