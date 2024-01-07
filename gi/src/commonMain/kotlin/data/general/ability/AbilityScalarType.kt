package data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1)
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