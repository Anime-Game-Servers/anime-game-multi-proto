package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.MPLevelEntityInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerEnterSceneInfoNotify {
    var curAvatarEntityId : Int
    var avatarEnterInfo : List<org.anime_game_servers.multi_proto.gi.data.scene.AvatarEnterSceneInfo>
    var teamEnterInfo : org.anime_game_servers.multi_proto.gi.data.scene.TeamEnterSceneInfo
    @AddedIn(GI_CB2)
    var mpLevelEntityInfo : org.anime_game_servers.multi_proto.gi.data.scene.entity.MPLevelEntityInfo
    @AddedIn(GI_1_0_0)
    var enterSceneToken : Int
}