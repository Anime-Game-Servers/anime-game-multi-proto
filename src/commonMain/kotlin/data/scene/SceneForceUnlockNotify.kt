package data.scene

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(messages.VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneForceUnlockNotify {
    var forceIdList: List<Int>
    var isAdd: Boolean
}