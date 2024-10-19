package org.anime_game_servers.multi_proto.gi.data.activity.photo

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.PhotoGallerySettleInfo

@AddedIn(GI_2_6_0)
@RemovedIn(GI_3_2_0)
@ProtoCommand(NOTIFY)
internal interface PhotoSettleNotify {
    var galleryId: Int
    var settleInfo: PhotoGallerySettleInfo
}
