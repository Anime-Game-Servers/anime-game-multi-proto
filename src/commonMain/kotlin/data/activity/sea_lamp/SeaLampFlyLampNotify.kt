package data.activity.sea_lamp

import annotations.AddedIn
import data.activity.sea_lamp.legacy.SeaLampActivityInfo
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.NOTIFY)
interface SeaLampFlyLampNotify {
    var pos: Vector
    var itemNum: Int
    var itemId: Int
    var param: Int
}