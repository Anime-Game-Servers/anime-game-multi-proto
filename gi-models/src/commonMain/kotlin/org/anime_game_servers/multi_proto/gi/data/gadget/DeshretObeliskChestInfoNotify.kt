package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_3_0_0)
@ProtoCommand(NOTIFY)
internal interface DeshretObeliskChestInfoNotify {
    var chestInfoList: List<DeshretObeliskChestInfo>
}