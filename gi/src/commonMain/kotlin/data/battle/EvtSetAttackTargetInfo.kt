package data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface EvtSetAttackTargetInfo {
    var attackTargetId: Int
    var entityId: Int
    @AddedIn(GI_2_6_0)
    var selectPointIndex: Int
}
