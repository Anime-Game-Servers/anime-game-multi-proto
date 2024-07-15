package data.regional_systems

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_5_0)
@ProtoModel
internal interface RegionalPlayVar {
    var baseValue: Float
    var maxValue: Float
    var type: Int
    var value: Float
}
