package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_2_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface UpdateAbilityCreatedMovingPlatformNotify {
    var opType: OpType
    var entityId: Int
}