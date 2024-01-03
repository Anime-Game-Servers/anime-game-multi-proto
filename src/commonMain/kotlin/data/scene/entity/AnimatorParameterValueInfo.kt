package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.VCB1)
@ProtoModel
internal interface AnimatorParameterValueInfo {
    var paraType: Int
    @OneOf(
        OneOfEntry(Int::class, "int_val"),
        OneOfEntry(Float::class, "float_val"),
        OneOfEntry(Boolean::class, "bool_val")
    )
    var paraVal: OneOfType
}
