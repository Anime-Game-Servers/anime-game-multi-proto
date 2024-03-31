package data.activity.fleur_fair

import data.gallery.BalloonSettleInfo
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface FleurFairBalloonSettleInfo {
    var isNewRecord: Boolean
    var settleInfo: BalloonSettleInfo
}
