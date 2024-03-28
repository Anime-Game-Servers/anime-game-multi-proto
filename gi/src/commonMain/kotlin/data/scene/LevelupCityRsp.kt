package data.scene

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
interface LevelupCityRsp {
    var areaId: Int
    var cityInfo: CityInfo
    var retcode: Int
    var sceneId: Int
}
