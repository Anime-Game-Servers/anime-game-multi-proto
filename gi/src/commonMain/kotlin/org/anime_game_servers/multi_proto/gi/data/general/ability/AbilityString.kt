package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilityString {
    @OneOf(
        OneOfEntry(String::class,"str"),
        OneOfEntry(Int::class, "hash")
    )
    var type: OneOfType
}