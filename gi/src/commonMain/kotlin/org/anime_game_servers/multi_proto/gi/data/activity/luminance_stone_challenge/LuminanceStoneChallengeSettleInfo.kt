package org.anime_game_servers.multi_proto.gi.data.activity.luminance_stone_challenge

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.luminance_stone_challenge.LuminanceStoneChallengeGallerySettleInfo

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface LuminanceStoneChallengeSettleInfo {
    var isNewRecord: Boolean
    var settleInfo: LuminanceStoneChallengeGallerySettleInfo
}
