package data.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface EvtSyncSkillAnchorPosition {
    var entityId: Int
    var skillAnchorPosition: Vector
}
