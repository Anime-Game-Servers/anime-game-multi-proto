package data.activity.aster

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AsterMidInfoNotify {
    var info: AsterMidDetailInfo
}