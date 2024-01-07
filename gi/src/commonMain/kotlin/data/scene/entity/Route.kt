package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.RoutePoint
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
@ProtoModel
internal interface Route {
    var routePoints: List<RoutePoint>
    var routeType: Int
}
