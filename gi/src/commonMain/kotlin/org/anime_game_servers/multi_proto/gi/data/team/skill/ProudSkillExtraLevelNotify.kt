package org.anime_game_servers.multi_proto.gi.data.team.skill

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface ProudSkillExtraLevelNotify {
    var avatarGuid: Long
    var extraLevel: Int
    var talentIndex: Int
    var talentType: Int
}
