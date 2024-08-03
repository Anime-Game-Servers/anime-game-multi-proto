package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.multi_proto.gi.data.general.entity.CreateEntityInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.CreateReason
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
internal interface SceneCreateEntityReq {
    var entity: org.anime_game_servers.multi_proto.gi.data.general.entity.CreateEntityInfo
    var reason: org.anime_game_servers.multi_proto.gi.data.scene.entity.CreateReason
    @AddedIn(Version.GI_CB2)
    var isDestroyWhenDisconnect: Boolean
}