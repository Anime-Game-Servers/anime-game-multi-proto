package org.anime_game_servers.multi_proto.gi.data.scene.script

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface ClientScriptEventNotify {
    var eventType: Int
    var paramList: List<Int>
    var sourceEntityId: Int
    var targetEntityId: Int
}
