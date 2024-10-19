package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CLIENT)
internal interface EvtAvatarStandUpNotify {
    var direction: Int
    var entityId: Int
    @AltName("performid")
    var performId: Int
    @AddedIn(GI_1_4_0)
    var chairId: Long
}
