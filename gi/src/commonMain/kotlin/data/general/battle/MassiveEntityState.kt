package data.general.battle

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface MassiveEntityState {
    var elementState: Int
    var entityType: Int
    var objId: Long
}
