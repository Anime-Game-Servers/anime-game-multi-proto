package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.NOTIFY)
interface SeaLampCoinNotify {
    var seaLampCoin: Int
}