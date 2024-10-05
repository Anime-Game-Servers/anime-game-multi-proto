package org.anime_game_servers.multi_proto.gi.data.activity.bounce_conjuring

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.bounce_conjuring.BounceConjuringGallerySettleInfo

@AddedIn(GI_1_6_0)
@ProtoCommand(NOTIFY)
internal interface BounceConjuringSettleNotify {
    var chapterId: Int
    var isNewRecord: Boolean
    var settleInfoMap: Map<Int, BounceConjuringGallerySettleInfo>
    var totalScore: Int
}
