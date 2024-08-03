package org.anime_game_servers.multi_proto.gi.data.scene.weather

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE, alternateNames = ["SceneWeatherForcastRsp"])
interface SceneWeatherForecastRsp {
    @AltName("forcastClimateList")
    var forecastClimateList: List<Int>
    var nextClimateTime: Long
    var retcode: Int
}
