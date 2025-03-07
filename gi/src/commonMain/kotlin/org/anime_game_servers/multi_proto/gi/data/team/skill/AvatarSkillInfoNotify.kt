package org.anime_game_servers.multi_proto.gi.data.team.skill

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.avatar.AvatarSkillInfo

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface AvatarSkillInfoNotify {
    var guid: Long
    var skillMap: Map<Int, AvatarSkillInfo>
}
