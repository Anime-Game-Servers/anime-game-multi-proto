package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FoundationNotify {
    var gadgetEntityId: Int
    var info: FoundationInfo
}