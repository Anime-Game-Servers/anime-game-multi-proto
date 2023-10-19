package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
interface EnterSceneReadyReq {
    @AddedIn(VERSION.V0_9_0)
    var enterSceneToken: Int
}