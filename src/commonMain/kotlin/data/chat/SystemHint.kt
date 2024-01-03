package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel("ChatInfo")
interface SystemHint {
    var type: Int
}