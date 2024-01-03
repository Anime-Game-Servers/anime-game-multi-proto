package data.general.item

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel("MaterialDeleteInfo")
interface DateTimeDelete {
    var deleteTime: Int
}