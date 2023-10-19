package data.scene

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(messages.VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.CLIENT)
interface EnterScenePeerNotify {
    var destSceneId : Int
    var peerId : Int
    var hostPeerId : Int
    @AddedIn(messages.VERSION.V1_0_0)
    var enterSceneToken : Int
}