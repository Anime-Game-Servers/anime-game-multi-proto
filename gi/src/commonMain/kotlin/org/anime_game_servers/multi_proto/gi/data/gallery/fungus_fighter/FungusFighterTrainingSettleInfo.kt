package org.anime_game_servers.multi_proto.gi.data.gallery.fungus_fighter

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface FungusFighterTrainingSettleInfo {
    var reason: GalleryStopReason
    var transaction: String
    var usedTime: Int
}
