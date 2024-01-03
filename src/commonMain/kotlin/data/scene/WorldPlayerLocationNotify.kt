package data.scene

import annotations.AddedIn
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB2
import messages.VERSION.V1_6_0

@AddedIn(VCB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface WorldPlayerLocationNotify {
    var playerLocList: List<PlayerLocationInfo>
    @AddedIn(V1_6_0)
    var playerWorldLocList: List<PlayerWorldLocationInfo>
}