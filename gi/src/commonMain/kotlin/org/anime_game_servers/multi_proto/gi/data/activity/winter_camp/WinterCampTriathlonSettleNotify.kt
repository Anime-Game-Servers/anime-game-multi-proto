package org.anime_game_servers.multi_proto.gi.data.activity.winter_camp

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_3_0)
@ProtoCommand(NOTIFY)
internal interface WinterCampTriathlonSettleNotify {
    var galleryId: Int
    var isNewRecord: Boolean
    var isSuccess: Boolean
    var limitedCoin: Int
    var normalCoin: Int
    var raceId: Int
    var remainTime: Int
    var score: Int
}
