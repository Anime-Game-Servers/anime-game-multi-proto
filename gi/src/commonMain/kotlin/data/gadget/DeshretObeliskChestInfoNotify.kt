package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_3_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface DeshretObeliskChestInfoNotify {
    var chestInfoList: List<DeshretObeliskChestInfo>
}