package org.anime_game_servers.multi_proto.gi.data.quest.variable

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface QuestUpdateQuestVarRsp {
    var retCode: Retcode
    var questId: Int
    @AddedIn(GI_0_9_0)
    var parentQuestId: Int
    @AddedIn(GI_1_2_0)
    var parentQuestVarSeq: Int
}
