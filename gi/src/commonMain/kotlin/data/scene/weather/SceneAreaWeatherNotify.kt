package data.scene.weather

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
interface SceneAreaWeatherNotify {
    var weatherGadgetId : Int
    var weatherValueMap : Map<Int, String>
    @AddedIn(Version.GI_CB2)
    var weatherAreaId : Int
    @AddedIn(GI_CB2)
    var climateType : Int
    @AddedIn(GI_1_0_0)
    var transDuration : Float
}