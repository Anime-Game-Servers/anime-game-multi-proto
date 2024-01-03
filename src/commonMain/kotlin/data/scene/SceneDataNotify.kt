package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB2
import messages.VERSION.V1_0_0

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
interface SceneDataNotify {
    var levelConfigNameList : List<String>
    @AddedIn(VERSION.V2_8_0)
    var sceneTagIdList : List<Int>
}