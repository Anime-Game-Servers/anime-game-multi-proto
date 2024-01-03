package data.general.ability

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1)
@ProtoEnum
internal enum class AbilityScalarType {
    @AltName("ABILITY_SCALAR_TYPE_UNKNOW")
    ABILITY_SCALAR_TYPE_UNKNOWN,
    ABILITY_SCALAR_TYPE_FLOAT,
    ABILITY_SCALAR_TYPE_INT,
    ABILITY_SCALAR_TYPE_BOOL,
    ABILITY_SCALAR_TYPE_TRIGGER,
    ABILITY_SCALAR_TYPE_STRING,
    ABILITY_SCALAR_TYPE_UINT,
}