package data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilityScalarValueEntry {
    var key: AbilityString
    var valueType: AbilityScalarType
    @OneOf(
        OneOfEntry(Float::class, "float_value"),
        OneOfEntry(String::class, "string_value"),
        OneOfEntry(Int::class, "int_value"),
        OneOfEntry(Int::class, "uint_value"), // TODO should be UInt when its directly supported
        allowTypedBasedMapping = false
    )
    var value: OneOfType
}