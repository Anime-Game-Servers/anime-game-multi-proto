package data.ability.action

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityActionCreateGadget {
    var pos: Vector
    var rot: Vector
    @AddedIn(GI_CB2)
    var roomId: Int
}
