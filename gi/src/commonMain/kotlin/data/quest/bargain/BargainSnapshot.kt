package data.quest.bargain

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface BargainSnapshot {
    var bargainId: Int
    var curMood: Int
    var expectedPrice: Int
    var priceLowLimit: Int
}
