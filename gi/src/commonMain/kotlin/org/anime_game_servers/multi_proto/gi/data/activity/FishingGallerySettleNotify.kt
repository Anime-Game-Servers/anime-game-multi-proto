package org.anime_game_servers.multi_proto.gi.data.activity

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.fishing.FishingGallerySettleInfo

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface FishingGallerySettleNotify {
    var galleryId: Int
    var levelId: Int
    var settleInfo: FishingGallerySettleInfo
}
