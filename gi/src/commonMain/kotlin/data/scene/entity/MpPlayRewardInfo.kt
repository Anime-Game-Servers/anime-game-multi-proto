package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
internal interface MpPlayRewardInfo {
    var resin: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>
}
