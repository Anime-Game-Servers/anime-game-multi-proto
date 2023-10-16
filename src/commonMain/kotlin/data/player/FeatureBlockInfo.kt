package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_1_0)
@ProtoModel
interface FeatureBlockInfo {
    var featureType: Int
    var endTime: Int
}
