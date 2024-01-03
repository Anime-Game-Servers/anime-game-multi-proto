package data.world

import annotations.AddedIn
import data.general.PropValue
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface HostPlayerNotify {
    var hostPeerId: Int
    var hostUid: Int
}
