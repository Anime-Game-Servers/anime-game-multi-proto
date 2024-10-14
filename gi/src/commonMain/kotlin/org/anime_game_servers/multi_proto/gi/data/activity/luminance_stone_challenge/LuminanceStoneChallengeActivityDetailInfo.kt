package org.anime_game_servers.multi_proto.gi.data.activity.luminance_stone_challenge

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface LuminanceStoneChallengeActivityDetailInfo {
    var bestScore: Int
    var currentStageId: Int
    var isContentClosed: Boolean
    var isFinalGalleryComplete: Boolean
}
