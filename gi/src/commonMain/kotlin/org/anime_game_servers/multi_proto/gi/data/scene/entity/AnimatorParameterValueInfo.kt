package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
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
