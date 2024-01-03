package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface PropValue {
    var type: Int
    var `val`: Long
    @OneOf(
        OneOfEntry(Long::class, "ival"),
        OneOfEntry(Float::class, "fval"),
        allowTypedBasedMapping = false
    )
    var value: OneOfType
}