package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_4_0)
@ProtoCommand(RESPONSE)
internal interface LanternRiteStartFireworksReformRsp {
    var challengeId: Int
    var factorInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite.LanternRiteFireworksReformFactorInfo>
    var fireElementAdditionRatio: Int
    var fireElementValue: Int
    var reformScore: Int
    var skillInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite.LanternRiteFireworksReformSkillInfo>
    var stageId: Int
    var staminaValue: Int
    var retcode: Retcode
}
