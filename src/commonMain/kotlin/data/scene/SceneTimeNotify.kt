package data.scene

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(messages.VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneTimeNotify {
    var sceneId: Int
    var isPaused: Boolean
    var scenetime: Long
}
