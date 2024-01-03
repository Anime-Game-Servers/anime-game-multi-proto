package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface OpenStateChangeNotify {
    var openStateMap: Map<Int, Int>
}
