package org.anime_game_servers.multi_proto.gi.data.gallery.fishing

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FishingGallerySettleNotify {
    var galleryId: Int
    var levelId: Int
    var settleInfo: FishingGallerySettleInfo
}