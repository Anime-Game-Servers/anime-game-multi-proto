package org.anime_game_servers.multi_proto.gi.data.quest.personal

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface UnlockPersonalLineRsp {
    var personalLineId: Int
    var retCode: Int
    
    @OneOf(
        types = [
            OneOfEntry(Int::class, "chapter_id"),
            OneOfEntry(Int::class, "level"),
        ]
    )
    var param: OneOfType
}
