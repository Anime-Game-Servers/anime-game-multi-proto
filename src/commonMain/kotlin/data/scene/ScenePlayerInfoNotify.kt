package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface ScenePlayerInfoNotify {
    var playerInfoList : List<ScenePlayerInfo>
}