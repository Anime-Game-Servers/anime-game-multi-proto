package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.player

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo

@AddedIn(GI_1_5_0)
@ProtoCommand(NOTIFY)
internal interface PlayerApplyEnterHomeNotify {
    var srcAppId: Int
    var srcPlayerInfo: OnlinePlayerInfo
}
