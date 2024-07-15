package data.quest.child

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface QuestProgressUpdateNotify {
    var failProgressList: List<Int>
    var finishProgressList: List<Int>
    var questId: Int
}
