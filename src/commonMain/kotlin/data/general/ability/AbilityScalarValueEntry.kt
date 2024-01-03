package data.general.ability

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AbilityScalarValueEntry {
    var key: AbilityString
    var valueType: AbilityScalarType
    @OneOf(
        OneOfEntry(Float::class, "float_value"),
        OneOfEntry(String::class, "string_value"),
        OneOfEntry(Int::class, "int_value"),
        OneOfEntry(UInt::class, "uint_value"),
        allowTypedBasedMapping = false
    )
    var value: OneOfType
}