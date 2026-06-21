package org.anime_game_servers.multi_proto.gi.data.scene.seal_battle

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface SealBattleProgressNotify {
    var endTime: Int
    var maxProgress: Int
    var progress: Int
    var sealEntityId: Int
    var sealRadius: Int
}
