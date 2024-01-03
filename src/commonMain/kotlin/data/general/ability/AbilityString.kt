package data.general.ability

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfEntry
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AbilityString {
    @OneOf(
        OneOfEntry(String::class,"str"),
        OneOfEntry(Int::class, "hash")
    )
    var type: OneOfType
}