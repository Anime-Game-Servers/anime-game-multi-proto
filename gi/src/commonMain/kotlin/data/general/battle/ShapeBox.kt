package data.general.battle

import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface ShapeBox {
    var axis0: Vector
    var axis1: Vector
    var axis2: Vector
    var center: Vector
    var extents: Vector
}
