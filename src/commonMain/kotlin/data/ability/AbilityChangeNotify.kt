package data.ability

import annotations.AddedIn
import data.general.ability.AbilityControlBlock
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AbilityChangeNotify {
    var entityId: Int
    var abilityControlBlock: AbilityControlBlock
}
