package org.anime_game_servers.multi_proto.gi.data.multiplayer

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface PlayerApplyEnterMpNotify {
    var srcPlayerInfo: OnlinePlayerInfo
    @AddedIn(GI_1_0_0)
    var srcAppId: Int
    @AddedIn(GI_2_1_0)
    var srcThreadIndex: Int
}