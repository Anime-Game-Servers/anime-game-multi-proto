package org.anime_game_servers.multi_proto.gi.data.team.skill

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface AvatarSkillDepotChangeNotify {
    var avatarGuid: Long
    var entityId: Int
    var skillDepotId: Int
    var talentIdList: List<Int>
    @AddedIn(GI_CB2)
    var coreProudSkillLevel: Int
    @AddedIn(GI_CB2)
    var proudSkillExtraLevelMap: Map<Int, Int>
    @AddedIn(GI_CB2)
    var proudSkillList: List<Int>
    @AddedIn(GI_CB2)
    var skillLevelMap: Map<Int, Int>
}
