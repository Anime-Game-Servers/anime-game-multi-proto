package org.anime_game_servers.multi_proto.gi.data.quest.variable

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@ProtoCommand(NOTIFY)
internal interface QuestUpdateQuestTimeVarNotify {
    var parentQuestId: Int
    var timeVarMap: Map<Int, Int>
}
