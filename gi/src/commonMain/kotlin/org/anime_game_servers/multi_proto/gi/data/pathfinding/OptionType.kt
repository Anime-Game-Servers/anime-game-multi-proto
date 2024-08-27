package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("QueryPathReq")
internal enum class OptionType {
    @AltName("OPTION_TYPE_NONE")
    OPTION_NONE,
    @AltName("OPTION_TYPE_NORMAL")
    OPTION_NORMAL,
    @AltName("OPTION_TYPE_FIRST_CAN_GO")
    OPTION_FIRST_CAN_GO,
}
