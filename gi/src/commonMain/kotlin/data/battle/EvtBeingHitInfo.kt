package data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface EvtBeingHitInfo {
    var attackResult: AttackResult
    @RemovedIn(GI_0_9_0)
    var forwardType: ForwardType
    var peerId: Int
    @AddedIn(GI_2_1_0)
    var frameNum: Int
}
