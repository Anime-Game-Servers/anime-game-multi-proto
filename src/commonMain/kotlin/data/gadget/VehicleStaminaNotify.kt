package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface VehicleStaminaNotify {
    var entityId: Int
    var curStamina: Float
}