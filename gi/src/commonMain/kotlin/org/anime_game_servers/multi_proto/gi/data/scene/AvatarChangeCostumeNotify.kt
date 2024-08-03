package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_1_6_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AvatarChangeCostumeNotify {
    var entityInfo : org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityInfo
}