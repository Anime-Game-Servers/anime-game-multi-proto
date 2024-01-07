package data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
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