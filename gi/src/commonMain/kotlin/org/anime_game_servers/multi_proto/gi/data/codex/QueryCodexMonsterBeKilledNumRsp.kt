package org.anime_game_servers.multi_proto.gi.data.codex

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface QueryCodexMonsterBeKilledNumRsp {
    var retcode: Retcode
    var beKilledNumList: List<Int>
    var codexIdList: List<Int>
    @AddedIn(GI_2_3_0)
    var beCapturedNumList: List<Int>
}
