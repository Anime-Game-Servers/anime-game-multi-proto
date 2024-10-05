package org.anime_game_servers.multi_proto.gi.data.activity.arena_challenge

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_4_0)
@ProtoCommand(RESPONSE)
internal interface StartArenaChallengeLevelRsp {
    var arenaChallengeId: Int
    var arenaChallengeLevel: Int
    var gadgetEntityId: Int
    var retcode: Retcode
}
