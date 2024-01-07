package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface VehicleStaminaNotify {
    var entityId: Int
    var curStamina: Float
}