package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V3_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DeshretObeliskChestInfoNotify {
    var chestInfoList: List<DeshretObeliskChestInfo>
}