package data.shop

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@RemovedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface ClientOpenShopmallNotify {
    var firstPageId: Int
    var secondPageId: Int
}