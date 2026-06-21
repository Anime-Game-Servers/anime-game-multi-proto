package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface MsgParam {
    
    @OneOf(
        types = [
            OneOfEntry(Float::class, "flt_param"),
            OneOfEntry(Int::class, "int_param"),
            OneOfEntry(String::class, "str_param"),
        ]
    )
    var param: OneOfType
}
