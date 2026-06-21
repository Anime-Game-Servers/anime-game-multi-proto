package org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.summer_time_v2_boat.SummerTimeV2BoatGallerySettleInfo

@AddedIn(GI_2_8_0)
@ProtoCommand(NOTIFY)
internal interface SummerTimeV2BoatSettleNotify {
    var galleryId: Int
    var isNewRecord: Boolean
    var settleInfo: SummerTimeV2BoatGallerySettleInfo
    var stageId: Int
}
