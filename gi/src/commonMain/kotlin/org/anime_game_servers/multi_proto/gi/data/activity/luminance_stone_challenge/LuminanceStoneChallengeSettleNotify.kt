package org.anime_game_servers.multi_proto.gi.data.activity.luminance_stone_challenge

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_7_0)
@ProtoCommand(NOTIFY)
internal interface LuminanceStoneChallengeSettleNotify {
    var galleryId: Int
    var settleInfo: LuminanceStoneChallengeSettleInfo
}
