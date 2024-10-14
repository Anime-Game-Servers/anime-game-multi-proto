package org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge_v2

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_3_2_0)
@ProtoCommand(RESPONSE)
internal interface EffigyChallengeV2EnterDungeonRsp {
    var retcode: Retcode
    var challengeModeDifficulty: Int
    var challengeModeSkillNo: Int
    var levelId: Int
}
