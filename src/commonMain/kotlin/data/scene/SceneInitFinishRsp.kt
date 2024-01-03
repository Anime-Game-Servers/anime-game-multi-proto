package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
interface SceneInitFinishRsp {
    @AddedIn(VERSION.V1_0_0)
    var enterSceneTtoken: Int
    var retCode: Int
}