package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB2
import messages.VERSION.V1_0_0

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
interface SceneAreaWeatherNotify {
    var weatherGadgetId : Int
    var weatherValueMap : Map<Int, String>
    @AddedIn(VERSION.VCB2)
    var weatherAreaId : Int
    @AddedIn(VCB2)
    var climateType : Int
    @AddedIn(V1_0_0)
    var transDuration : Float
}