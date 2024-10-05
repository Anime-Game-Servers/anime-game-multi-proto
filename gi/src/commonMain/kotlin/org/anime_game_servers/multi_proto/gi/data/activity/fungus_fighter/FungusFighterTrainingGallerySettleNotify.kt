package org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason

@AddedIn(GI_3_2_0)
@ProtoCommand(NOTIFY)
internal interface FungusFighterTrainingGallerySettleNotify {
    var deadFungusNum: Int
    var finalScore: Int
    var gadgetLifePercentage: Int
    var isFinalSettle: Boolean
    var isNewRecord: Boolean
    var reason: GalleryStopReason
    var settleRound: Int
    var totalUsedTime: Int
}
