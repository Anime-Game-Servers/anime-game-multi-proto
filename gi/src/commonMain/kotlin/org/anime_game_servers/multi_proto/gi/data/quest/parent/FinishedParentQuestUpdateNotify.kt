package org.anime_game_servers.multi_proto.gi.data.quest.parent

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface FinishedParentQuestUpdateNotify {
    var parentQuestList: List<org.anime_game_servers.multi_proto.gi.data.quest.parent.ParentQuest>
}
