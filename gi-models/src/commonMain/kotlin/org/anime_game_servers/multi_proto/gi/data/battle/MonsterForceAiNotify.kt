package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@RemovedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface MonsterForceAiNotify {
    var isOpen: Boolean
    var monsterEntityId: Int
}
