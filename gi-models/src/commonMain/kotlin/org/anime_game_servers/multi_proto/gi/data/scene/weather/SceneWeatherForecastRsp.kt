package org.anime_game_servers.multi_proto.gi.data.scene.weather

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE, alternateNames = ["SceneWeatherForcastRsp"])
internal interface SceneWeatherForecastRsp {
    var retcode: Retcode
    @AltName("forcastClimateList")
    var forecastClimateList: List<Int>
    var nextClimateTime: Long
}
