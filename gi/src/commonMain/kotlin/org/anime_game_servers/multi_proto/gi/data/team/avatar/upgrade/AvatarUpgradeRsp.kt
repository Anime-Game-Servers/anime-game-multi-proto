package org.anime_game_servers.multi_proto.gi.data.team.avatar.upgrade

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface AvatarUpgradeRsp {
    var avatarGuid: Long
    var curFightPropMap: Map<Int, Float>
    var curLevel: Int
    var oldFightPropMap: Map<Int, Float>
    var oldLevel: Int
    var retcode: Int
}
