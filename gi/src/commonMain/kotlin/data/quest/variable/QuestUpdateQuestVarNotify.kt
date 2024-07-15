package data.quest.variable

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface QuestUpdateQuestVarNotify {
    var parentQuestId: Int
    var questVar: List<Int>
    @AddedIn(GI_1_2_0)
    var parentQuestVarSeq: Int
}
